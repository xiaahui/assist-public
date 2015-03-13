#!/usr/bin/env python
# This script generates random assist instances

from __future__ import print_function
import sys, argparse, random, collections, datetime
import binpack2assist

def parseAbbrevList(s, n):
    l = [int(e) for e in s.split(",")]
    while len(l) < n:
        l.append(l[-1])
    return l

def generate(args, filename):
    with open(filename, 'w') as w:
        print('Global {\n    System name = "Random instance %s with args %s at %s";\n}' % (filename, args, datetime.datetime.now()), file=w)
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
                    for _ in range(numTypes - 1):
                        sizes.append(random.randint(0, args.interfaces_per_connector - used))
                        used += sizes[-1]
                    sizes.append(args.interfaces_per_connector - used)
                    types = list(range(args.types))
                    for s in sizes:
                        t = random.choice(types)
                        types.remove(t)
                        if s > 0:
                            print((12*" ") + '"T%02i" = %s;' % (t, s), file=w)
                            availInterfaces += s * [(i,j,k,t)]
                    print("        }", file=w)
                print("    }", file=w)
            print("}", file=w)

        if args.interfaces > 1:
            numUsedInterfaces = int(args.interfaces)
        else:
            numUsedInterfaces = int(args.interfaces * len(availInterfaces))
        if numUsedInterfaces > len(availInterfaces):
            print("Too many interfaces needed, please adapt --interfaces", file=sys.stderr)
        usedInterfaces = []
        locations = [collections.defaultdict(list), collections.defaultdict(list), collections.defaultdict(list)]
        while len(usedInterfaces) < numUsedInterfaces:
            iface = random.choice(availInterfaces)
            iname = "I%04i" % len(usedInterfaces)
            usedInterfaces.append((iface, iname))
            for i in range(3):
                locations[i][tuple(iface[:i+1])].append(iname)
            availInterfaces.remove(iface)
        print("\nInterfaces {", file=w)
        for iface, name in usedInterfaces:
            print("""\
    Interface %s {
        Type = "T%02i";
        Route = "R%02i";
    }""" % (name, iface[3], routes[(iface[0], iface[1], iface[2])]), file=w)

        print("}\n\nInterfaceGroups {", file=w)
        numGroupDisloc = parseAbbrevList(args.dislocality_groups, 3)
        maxSetDislocGroup = parseAbbrevList(args.max_sets_per_dislocality_group, 3)
        maxIFaceDislocSet = parseAbbrevList(args.max_interfaces_per_dislocality_group_set, 3)
        groupDislocs = []
        for level, (name, count) in enumerate(zip(["Connector", "RDC", "Compartment"], numGroupDisloc)):
            for j in range(count):
                if len(locations[level]) <= 1:
                    print("Warning! Not enough locations for %s group dislocality." % name)
                    break
                numSets = random.randint(2, maxSetDislocGroup[level])
                sets = [[] for _ in xrange(numSets)]
                setSizes = [random.randint(1, maxIFaceDislocSet[level]) for _ in xrange(numSets)]
                for ifaces in locations[level].values():
                    random.choice(sets).extend(ifaces)
                groups = []
                for idx, (s, size) in enumerate(zip(sets, setSizes)):
                    while len(s) > size:
                        s.pop(random.randrange(len(s)))
                    if len(s) == 0:
                        print("Warning! Skipping empty set on group dislocality.")
                    else:
                        gname = "G%s_%s_%s" % (level, j, idx)
                        print("    Group %s { %s };" % (gname, ",".join(s)), file=w)
                        groups.append(gname)
                if len(groups) <= 1:
                    print("Warning! Skipping underspecified group dislocality.")
                else:
                    groupDislocs.append((groups, name))

        print("}\n\nRestrictions {", file=w)
        for groups, name in groupDislocs:
            print("    %s dislocal up to %s;" % (",".join(groups), name), file=w)
        numDisloc = parseAbbrevList(args.dislocalities, 3)
        maxIFaceDisloc = parseAbbrevList(args.max_interfaces_per_dislocality, 3)
        for level, (name, count) in enumerate(zip(["Connector", "RDC", "Compartment"], numDisloc)):
            for j in range(count):
                locs = list(locations[level].keys())
                if len(locs) <= 1:
                    print("Warning! Not enough locations for %s dislocality." % name)
                    break
                numIFaces = min(len(locs), random.randint(2, maxIFaceDisloc[level]))
                ifaces = []
                for i in range(numIFaces):
                    loc = locs.pop(random.randrange(len(locs)))
                    ifaces.append(random.choice(locations[level][loc]))
                print("    %s dislocal up to %s;" % (",".join(ifaces), name), file=w)

        numColoc = parseAbbrevList(args.colocalities, 3)
        maxIFaceColoc = parseAbbrevList(args.max_interfaces_per_colocality, 3)
        for level, (name, count) in enumerate(zip(["Connector", "RDC", "Compartment"], numColoc)):
            for j in range(count):
                numIFaces = random.randint(2, maxIFaceColoc[level])
                ifaces = []
                while len(ifaces) < numIFaces:
                    ifaces = list(random.choice(locations[level].values()))
                while len(ifaces) > numIFaces:
                    ifaces.pop(random.randrange(len(ifaces)))
                print("    %s on same %s;" % (",".join(ifaces), name), file=w)

        print("}\n\n", file=w)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("-S", "--seed", type=int, default=23432, help="random seed")
    parser.add_argument("-c", "--connectors", type=int, default=6, help="set fixed number of connectors")
    parser.add_argument("-r", "--rdcs", type=int, default=4, help="set fixed number of RDCs")
    parser.add_argument("-C", "--compartments", type=int, default=6, help="set fixed number of compartments")
    parser.add_argument("-R", "--routes", type=int, default=4, help="set fixed number of routes")
    parser.add_argument("-T", "--types", type=int, default=40, help="set fixed number of types")
    parser.add_argument("-y", "--max-types-per-connector", type=int, default=6, help="set maximum number of types per connector")
    parser.add_argument("-I", "--interfaces-per-connector", type=int, default=16, help="set fixed number of interfaces per connector")
    parser.add_argument("-n", "--interfaces", type=float, default=1.0, help="set either used fraction (value < 1) or total number of interfaces needed")
    parser.add_argument("-d", "--dislocalities", default="0,0,0", help="set number of dislocalities per level")
    parser.add_argument("-g", "--dislocality-groups", default="0,10,0", help="set number of dislocality groups per level")
    parser.add_argument("-l", "--colocalities", default="0,10,10", help="set number of colocalities per level")
    parser.add_argument("-p", "--max-interfaces-per-dislocality", default="6", help="set maximum number of interfaces per dislocality on level")
    parser.add_argument("-m", "--max-sets-per-dislocality-group", default="15", help="set maximum number of sets per dislocality group on level")
    parser.add_argument("-k", "--max-interfaces-per-dislocality-group-set", default="20", help="set maximum number of interfaces per dislocality group set on level")
    parser.add_argument("-q", "--max-interfaces-per-colocality", default="6", help="set maximum number of interfaces per colocality on level")
    parser.add_argument("-o", "--output", default="random%s.mdsl", help="name of the output file")
    parser.add_argument("-N", "--number-instances", type=int, default=1, help="total number of instances to start")
    binpack2assist.addArgs(parser)
    args = parser.parse_args()

    random.seed(args.seed)
    mdsls = []
    for i in xrange(args.number_instances):
        mdsls.append(args.output % i)
        generate(args, mdsls[-1])
    print("generated", mdsls)
    if args.instances > 0:
        binpack2assist.runAssist(mdsls, args)
