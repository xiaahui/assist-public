#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import os, sys, argparse, random

def parseAbbrevList(s, n):
    l = [int(e) for e in s.split(",")]
    while len(l) < n:
        l.append(l[-1])
    return l

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("-s", "--seed", type=int, default=23432, help="random seed")
    parser.add_argument("-c", "--connectors", type=int, default=6, help="set fixed number of connectors")
    parser.add_argument("-r", "--rdcs", type=int, default=4, help="set fixed number of RDCs")
    parser.add_argument("-C", "--compartments", type=int, default=6, help="set fixed number of compartments")
    parser.add_argument("-R", "--routes", type=int, default=4, help="set fixed number of routes")
    parser.add_argument("-t", "--types", type=int, default=40, help="set fixed number of types")
    parser.add_argument("-y", "--max-types-per-connector", type=int, default=6, help="set maximum number of types per connector")
    parser.add_argument("-i", "--interfaces-per-connector", type=int, default=16, help="set fixed number of interfaces per connector")
    parser.add_argument("-n", "--interfaces", type=float, default=0.9, help="set either used fraction (value < 1) or total number of interfaces needed")
    parser.add_argument("-d", "--dislocalities", default="0,10,10", help="set number of dislocalities per level")
    parser.add_argument("-l", "--colocalities", default="0,10,10", help="set number of colocalities per level")
    parser.add_argument("-p", "--max-interfaces-per-dislocality", default="6", help="set maximum number of interfaces per dislocality on level")
    parser.add_argument("-q", "--max-interfaces-per-colocality", default="6", help="set maximum number of interfaces per colocality on level")
    parser.add_argument("-o", "--output", default="random.mdsl", help="name of the output file")
    args = parser.parse_args()

    random.seed(args.seed)
    with open(args.output, 'w') as w:
        print('Global {\n    System name = "Random instance %s";\n}' % args.output, file=w)
        availInterfaces = []
        routes = {}
        # build hardware
        for i in range(args.compartments):
            print("Compartment Comp%s {" % i, file=w)
            for j in range(args.rdcs):
                print("    RDC RDC%s {" % j, file=w)
                for k in range(args.connectors):
                    # choose route for connector
                    routes[(i,j,k)] = random.randint(0, args.routes)
                    print("        Connector Conn%s {" % k, file=w)
                    numTypes = random.randint(1, args.max_types_per_connector)
                    sizes = []
                    used = 0
                    for l in range(numTypes - 1):
                        sizes.append(random.randint(0, args.interfaces_per_connector - used))
                        used += sizes[-1]
                    sizes.append(args.interfaces_per_connector - used)
                    types = list(range(args.types))
                    for m, s in enumerate(sizes):
                        t = random.choice(types)
                        types.remove(t)
                        if s > 0:
                            print((12*" ") + "CustomType%s = %s;" % (t, s), file=w)
                            for n in range(s):
                                availInterfaces.append([i,j,k,t])
                    print("        }", file=w)
                print("    }", file=w)
            print("}", file=w)
        
        if args.interfaces >= 1:
            numUsedInterfaces = int(args.interfaces)
        else:
            numUsedInterfaces = int(args.interfaces * len(availInterfaces))
        if numUsedInterfaces > len(availInterfaces):
            print("Too many interfaces needed, please adapt --interfaces", file=sys.stderr)
        usedInterfaces = []
        while len(usedInterfaces) < numUsedInterfaces:
            iface = random.choice(availInterfaces)
            usedInterfaces.append(iface)
            availInterfaces.remove(iface)
        print("\nInterfaces {", file=w)
        for idx, iface in enumerate(usedInterfaces):
            print("""\
    Interface I%s {
        Type = CustomType%s;
        Route = "R%s";
    }""" % (idx, iface[3], routes[(iface[0], iface[1], iface[2])]), file=w)

        print("}\n\nRestrictions {", file=w)
        numDisloc = parseAbbrevList(args.dislocalities, 3)
        maxIFaceDisloc = parseAbbrevList(args.max_interfaces_per_dislocality, 3)
        for level, (name, count) in enumerate(zip(["Connector", "RDC", "Compartment"], numDisloc)):
            for j in range(count):
                ifaceLocs = set()
                ifaces = []
                for i in range(maxIFaceDisloc[level]):
                    ifaceIdx = random.randint(0, len(usedInterfaces) - 1)
                    loc = tuple(usedInterfaces[ifaceIdx][:level+1])
                    if loc not in ifaceLocs:
                        ifaces.append("I%s" % ifaceIdx)
                        ifaceLocs.add(loc)
                if len(ifaces) > 1:
                    print("    %s dislocal up to %s;" % (",".join(ifaces), name), file=w)
        #for i in range(int(numItems)):
            #print("    G%s on same Connector;" % i, file=w)

        print("}\n\n", file=w)
