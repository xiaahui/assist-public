#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import sys, argparse
parser = argparse.ArgumentParser()
parser.add_argument('files', metavar='<file>', nargs='+',
                    help='files to parse')
parser.add_argument("-n", "--number", type=int, help="set fixed number of bins/boards")
parser.add_argument("-s", "--scale", type=float, default=1.0, help="scale number of bins/boards")
parser.add_argument("-c", "--capacity-scale", type=float, default=1.0, help="scale capacity of bins/boards")
args = parser.parse_args()

def readBPPC(numItems, cap, r):
    intCap = int(cap * args.capacity_scale)
    numBoards = args.number if args.number else int(numBins * args.scale)
    items = []
    with open(r.name[:-4] + ".mdsl", 'w') as w:
        print("""\
Global {
    System name = "Binpack with conflicts System %s";
}

Hardware {""" % r.name, file=w)

        for i in range(numBoards):
            print("""\
    Board Board%s {
        Processor Processor%s {
            Core Core%s {
                Capacity = %s;
            }
        }
    }""" % (i, i, i, intCap), file=w)

        print("}\n\nSoftware {", file=w)

        for i in range(int(numItems)):
            items.append(r.readline().split())
            print("""\
    Application A%s {
        Core-utilization = %s;
    }""" % (items[-1][0], int(float(items[-1][1]))), file=w)

        print("}\n\nRelations {", file=w)
        for item in items:
            for conflict in item[2:]:
                print("    A%s,A%s dislocal up to Board;" % (item[0], conflict), file=w)

        print("}\n\n", file=w)



for f in args.files:
    with open(f) as r:
        first = r.readline().split()
        if len(first) == 2:
            readBPPC(int(first[0]), float(first[1]), r)
            continue
        numProbs = int(first[0])
        print("Converting %s problems from %s" % (numProbs, f))
        for p in range(numProbs):
            desc = r.readline().strip()
            cap, numItems, numBins = [float(x) for x in r.readline().split()]
            intCap = int(cap * args.capacity_scale)
            numBoards = args.number if args.number else int(numBins * args.scale)
            with open(desc + ".mdsl", 'w') as w:
                print("""\
Global {
        System name = "Binpack System %s";
}

Hardware {""" % desc, file=w)

                for i in range(numBoards):
                    print("""\
        Board Board%s {
                Processor Processor%s {
                        Core Core%s {
                                Capacity = %s;
                        }
                }
        }""" % (i, i, i, intCap), file=w)

                print("}\n\nSoftware {", file=w)

                for i in range(int(numItems)):
                    print("""\
        Application A%s {
                Core-utilization = %s;
        }""" % (i, int(float(r.readline()))), file=w)

                print("}\n", file=w)
