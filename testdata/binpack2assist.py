#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import sys

for f in sys.argv[1:]:
    with open(f) as r:
        numProbs = int(r.readline())
        print("Converting %s problems from %s" % (numProbs, f))
        for p in range(numProbs):
            desc = r.readline().strip()
            cap, numItems, numBins = [int(x) for x in r.readline().split()]
            with open(desc + ".mdsl", 'w') as w:
                print("""\
Global {
        System name = "Binpack System %s";
}

Hardware {""" % desc, file=w)

                for i in range(numBins):
                    print("""\
        Board Board%s {
                Processor Processor%s {
                        Core Core%s {
                                Capacity = %s;
                        }
                }
        }""" % (i, i, i, cap), file=w)

                print("}\n\nSoftware {", file=w)

                for i in range(numItems):
                    print("""\
        Application A%s {
                Core-utilization = %s;
        }""" % (i, int(r.readline())), file=w)

                print("}\n", file=w)
