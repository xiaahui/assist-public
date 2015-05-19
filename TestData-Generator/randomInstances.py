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

def writeInterfacesAndRestrictions(w, usedInterfaces, totalAvailInterfaces, allGroups, groupDislocs, dislocs, colocs, printAll=False):
    usedInRestrictions = collections.defaultdict(int)
    for _, ifaces in allGroups:
        for iface in ifaces:
            usedInRestrictions[iface] += 1
    for ifaces, _ in dislocs + colocs:
        for iface in ifaces:
            usedInRestrictions[iface] += 1
    
    print("\nInterfaces {", file=w)

    for iface, name in usedInterfaces:
        if printAll or name in usedInRestrictions:
            print("""\
    Interface %s {
        // placement Comp%s.RDC%s.Conn%s
        Type = "T%02i";
    }""" % (name, iface[2], iface[1], iface[0], iface[3]), file=w)

    print("}\n\nInterfaceGroups {", file=w)
    for gname, s in allGroups:
        print("    Group %s { %s };" % (gname, ",".join(s)), file=w)

    print("}\n\nRestrictions {", file=w)
    for groups, name in groupDislocs:
        print("    %s dislocal up to %s;" % (",".join(groups), name), file=w)
    for ifaces, name in dislocs:
        print("    %s dislocal up to %s;" % (",".join(ifaces), name), file=w)
    for ifaces, name in colocs:
        print("    %s on same %s;" % (",".join(ifaces), name), file=w)

    print("}\n\n", file=w)
    
    before = ""
    percentUsed = 100. * len(usedInterfaces) / totalAvailInterfaces
    if not printAll:
        before = " (%.2f before filtering)" % percentUsed
        percentUsed = 100. * len(usedInRestrictions) / totalAvailInterfaces 
    print("%s written %.2f%% of supply used%s, %.2f dislocalities per used interface." % (w.name, percentUsed, before,
                                                                                   sum(usedInRestrictions.values()) / float(len(usedInterfaces))))
    
def generate(args, filename):
    with open(filename, 'w') as w:
        print('Global {\n    Name = "Random instance %s with args %s at %s";\n}' % (filename, args, datetime.datetime.now()), file=w)
        availInterfaces = []
        # build hardware
        for i in range(args.compartments):
            print("Compartment Comp%s {" % i, file=w)
            for j in range(args.rdcs):
                print("    RDC RDC%s {" % j, file=w)
                for k in range(args.connectors):
                    # choose route for connector
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
                            availInterfaces += s * [(k,j,i,t)]
                    print("        }", file=w)
                print("    }", file=w)
            print("}", file=w)

        # determining used interfaces
        totalAvailInterfaces = len(availInterfaces)
        if args.interfaces > 1:
            numUsedInterfaces = int(args.interfaces)
        else:
            numUsedInterfaces = int(args.interfaces * totalAvailInterfaces)
        if numUsedInterfaces > totalAvailInterfaces:
            print("Too many interfaces needed, please adapt --interfaces", file=sys.stderr)
        usedInterfaces = []
        locations = [collections.defaultdict(list), collections.defaultdict(list), collections.defaultdict(list)]
        while len(usedInterfaces) < numUsedInterfaces:
            iface = random.choice(availInterfaces)
            iname = "I%04i" % len(usedInterfaces)
            usedInterfaces.append((iface, iname))
            for i in range(3):
                locations[i][tuple(iface[i:3])].append(iname)
            availInterfaces.remove(iface)

        #determining group dislocalities
        numGroupDisloc = parseAbbrevList(args.dislocality_groups, 3)
        maxSetDislocGroup = parseAbbrevList(args.max_sets_per_dislocality_group, 3)
        maxIFaceDislocSet = parseAbbrevList(args.max_interfaces_per_dislocality_group_set, 3)
        allGroups = []
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
                        groups.append(gname)
                        allGroups.append((gname, s))
                if len(groups) <= 1:
                    print("Warning! Skipping underspecified group dislocality.")
                else:
                    groupDislocs.append((groups, name))
        
        #determining individual interface dislocalities
        numDisloc = parseAbbrevList(args.dislocalities, 3)
        maxIFaceDisloc = parseAbbrevList(args.max_interfaces_per_dislocality, 3)
        dislocs = []
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
                dislocs.append((ifaces, name))

        #determining colocalities
        numColoc = parseAbbrevList(args.colocalities, 3)
        maxIFaceColoc = parseAbbrevList(args.max_interfaces_per_colocality, 3)
        colocs = []
        for level, (name, count) in enumerate(zip(["Connector", "RDC", "Compartment"], numColoc)):
            for j in range(count):
                numIFaces = random.randint(2, maxIFaceColoc[level])
                ifaces = []
                while len(ifaces) < numIFaces:
                    ifaces = list(random.choice(locations[level].values()))
                while len(ifaces) > numIFaces:
                    ifaces.pop(random.randrange(len(ifaces)))
                colocs.append((ifaces, name))

        writeInterfacesAndRestrictions(w, usedInterfaces, totalAvailInterfaces, allGroups, groupDislocs, dislocs, colocs, args.all_interfaces)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("-S", "--seed", type=int, default=23432, help="random seed")
    parser.add_argument("-c", "--connectors", type=int, default=8, help="set fixed number of connectors per RDC")
    parser.add_argument("-r", "--rdcs", type=int, default=5, help="set fixed number of RDCs per compartment")
    parser.add_argument("-C", "--compartments", type=int, default=6, help="set fixed number of compartments")
    parser.add_argument("-T", "--types", type=int, default=40, help="set fixed number of types")
    parser.add_argument("-y", "--max-types-per-connector", type=int, default=6, help="set maximum number of types per connector")
    parser.add_argument("-I", "--interfaces-per-connector", type=int, default=16, help="set fixed number of interfaces per connector")
    parser.add_argument("-n", "--interfaces", type=float, default=1.0, help="set either used fraction (value < 1) or total number of interfaces needed")
    parser.add_argument("-d", "--dislocalities", default="0,0,0", help="set number of dislocalities per level")
    parser.add_argument("-g", "--dislocality-groups", default="15,15,0", help="set number of dislocality groups per level")
    parser.add_argument("-L", "--colocalities", default="60,0,0", help="set number of colocalities per level")
    parser.add_argument("-p", "--max-interfaces-per-dislocality", default="6", help="set maximum number of interfaces per dislocality on level")
    parser.add_argument("-M", "--max-sets-per-dislocality-group", default="15", help="set maximum number of sets per dislocality group on level")
    parser.add_argument("-k", "--max-interfaces-per-dislocality-group-set", default="20", help="set maximum number of interfaces per dislocality group set on level")
    parser.add_argument("-q", "--max-interfaces-per-colocality", default="6", help="set maximum number of interfaces per colocality on level")
    parser.add_argument("-o", "--output", default="random%03i.mdsl", help="name of the output file")
    parser.add_argument("-N", "--number-instances", type=int, default=1, help="total number of instances to start")
    parser.add_argument("-A", "--all-interfaces", action="store_true", default=False, help="whether to print all interfaces")
    binpack2assist.addArgs(parser)
    args = parser.parse_args()

    random.seed(args.seed)
    mdsls = []
    for i in xrange(args.number_instances):
        mdsls.append(args.output % i)
        generate(args, mdsls[-1])
    if args.instances > 0:
        binpack2assist.runAssist(mdsls, args)