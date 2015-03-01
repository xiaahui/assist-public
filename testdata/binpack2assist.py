#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import os, sys, argparse, zipfile

def readBPPC(numItems, cap, input, bound):
    base = os.path.basename(input.name)
    intCap = int(cap * args.capacity_scale)
    numBoards = args.number if args.number else int(bound[base] * args.scale)
    items = []
    with open(base[:-4] + ".mdsl", 'w') as w:
        print("""\
Global {
    System name = "Binpack with conflicts System %s";
}

Hardware {""" % base, file=w)

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
            items.append(input.readline().split())
            print("""\
    Application A%s {
        Core-utilization = %s;
    }""" % (items[-1][0], int(float(items[-1][1]))), file=w)

        print("}\n\nRelations {", file=w)
        for item in items:
            for conflict in item[2:]:
                print("    A%s,A%s dislocal up to Board;" % (item[0], conflict), file=w)

        print("}\n\n", file=w)

def readFile(input):
        first = input.readline().split()
        if len(first) == 2:
            readBPPC(int(first[0]), float(first[1]), input, bound)
            return
        numProbs = int(first[0])
        print("Converting %s problems from %s" % (numProbs, f))
        for p in range(numProbs):
            desc = input.readline().strip()
            cap, numItems, numBins = [float(x) for x in input.readline().split()]
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
        }""" % (i, int(float(input.readline()))), file=w)

                print("}\n", file=w)

def getEntry(line):
    return line.split(">")[1].split("<")[0]

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('files', metavar='<file>', nargs='+',
                        help='files to parse')
    parser.add_argument("-n", "--number", type=int, help="set fixed number of bins/boards")
    parser.add_argument("-s", "--scale", type=float, default=1.0, help="scale number of bins/boards")
    parser.add_argument("-c", "--capacity-scale", type=float, default=1.0, help="scale capacity of bins/boards")
    parser.add_argument("-r", "--bppc-results", help="results file for BPPC to read the bin number from")
    args = parser.parse_args()

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

    for f in args.files:
        if zipfile.is_zipfile(f):
            zipf = zipfile.ZipFile(f)
            for z in zipf.namelist():
                readFile(zipf.open(z))
        else:
            readFile(open(f))
