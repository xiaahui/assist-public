#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import os, sys, argparse, zipfile, subprocess, time

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('files', metavar='<file>', nargs='+',
                        help='files to parse')
    parser.add_argument("-C", "--compartments", type=int, default=6, help="set fixed number of conmpartments")
    parser.add_argument("-r", "--rdcs", type=int, default=4, help="set fixed number of RDCs")
    parser.add_argument("-c", "--connectors", type=int, default=6, help="set fixed number of connectors")
    parser.add_argument("-t", "--types", type=int, default=45, help="set fixed number of types")
    parser.add_argument("-y", "--max-types-per-connector", type=int, default=6, help="set fixed number of types per connector")
    parser.add_argument("-i", "--interfaces-per-connector", type=int, default=16, help="set fixed number of types per connector")
    parser.add_argument("-o", "--output", default="random.mdsl", help="name of the output file")
    args = parser.parse_args()

    with open(args.output, 'w') as w:
        print("""\
Global {
    System name = "Random instance %s";
}""" % args.output, file=w)

        for i in range(args.compartments):
            print("Compartment Compartment%s {" % i, file=w)
			for j in range(args.rdcs):
				print("RDC RDC%s {" % j, file=w)
				for k in range(args.connectors):
					print("Connector Connector%s {" % j, file=w)
					numTypes = random.randint(1, args.max_types_per_connector)
					sizes = []
					used = 0
					for l in range(numTypes-1):
						sizes.append(random.randint(0, args.interfaces_per_connector-used))
						used += sizes[-1]
					sizes.append(args.interfaces_per_connector - used)
					types = list(range(args.types))
					for m, s in enumerate(sizes):
						t = random.choice(types)
						types.remove(t)
						if s > 0:
							print("CustomType%s = %s;" % (t, s), file=w)
        }
    }
}""" % (i, i, i, intCap), file=w)

        print("\n\nInterfaces {", file=w)
        interfaces = {}
        for i in range(int(numItems)):
            items.append(input.readline().split())
            interfaces[i] = []
            for j in range(int(float(items[-1][1]))):
                interfaces[i].append("I%s_%s" % (items[-1][0], j))
                print("""\
    Interface %s {
        Type = CustomType0;
    }""" % interfaces[i][-1], file=w)

        print("}\n\nInterfaceGroups {", file=w)
        for i in range(int(numItems)):
            print("    Group G%s { %s };" % (i, ",".join(interfaces[i])), file=w)

        print("}\n\nRestrictions {", file=w)
        for i in range(int(numItems)):
            print("    G%s on same Connector;" % i, file=w)
        for item in items:
            for conflict in item[2:]:
                print("    I%s_0,I%s_0 dislocal up to Connector;" % (item[0], conflict), file=w)

        print("}\n\n", file=w)
    return [w.name]

	args.interfaces
    bound = {}
    if args.bppc_results:
        with open(args.bppc_results) as results:
            count = -1
            for line in results:
                if "BPPC_" in line and ".txt" in line:
                    name = getEntry(line)
                    count = 0
                if count >= 0:
                    count += 1
                if count == 3:
                    bound[name] = int(getEntry(line))
                    count = -1
    mdsls = []
    for f in args.files:
        if zipfile.is_zipfile(f):
            zipf = zipfile.ZipFile(f)
            for z in zipf.namelist():
                mdsls += readFile(zipf.open(z))
        else:
            mdsls += readFile(open(f))

    if args.instances > 0:
        runAssist(mdsls, args)
