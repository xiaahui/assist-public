#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import os, sys, argparse, zipfile, subprocess, time

def readBPPC(numItems, cap, input, bound):
    base = os.path.basename(input.name)
    intCap = int(cap * args.capacity_scale)
    numBoards = args.number if args.number else int(bound[base] * args.bin_scale)
    items = []
    with open(base[:-4] + ".mdsl", 'w') as w:
        print("""\
Global {
    System name = "Binpack with conflicts System %s";
}""" % base, file=w)

        for i in range(numBoards):
            print("""\
Compartment Compartment%s {
    RDC RDC%s {
        Connector Connector%s {
            %s interface with type CustomType0;
        }
    }
}""" % (i, i, i, intCap), file=w)

        print("\n\nInterfaces {", file=w)

        for i in range(int(numItems)):
            items.append(input.readline().split())
            for j in range(int(float(items[-1][1]))):
                print("""\
    Interface I%s.%s {
        Type = CustomType0;
    }""" % (items[-1][0], j), file=w)

        print("}\n\nInterfaceGroups {", file=w)
        for item in items:
            for conflict in item[2:]:
                print("    I%s.0,I%s dislocal up to Connector;" % (item[0], conflict), file=w)

        print("}\n\nRestrictions {", file=w)
        for item in items:
            for conflict in item[2:]:
                print("    I%s.0,I%s dislocal up to Connector;" % (item[0], conflict), file=w)

        print("}\n\n", file=w)
    return w.name

def readFile(input):
    first = input.readline().split()
    try:
        f0 = int(first[0])
    except:
        return None
    if len(first) == 2:
        return readBPPC(f0, float(first[1]), input, bound)
    print("Converting %s problems from %s" % (f0, f))
    for p in range(f0):
        desc = input.readline().strip()
        cap, numItems, numBins = [float(x) for x in input.readline().split()]
        intCap = int(cap * args.capacity_scale)
        numBoards = args.number if args.number else int(numBins * args.bin_scale)
        with open(desc + ".mdsl", 'w') as w:
            print("""\
Global {
        System name = "Binpack System %s";
}""" % desc, file=w)

            for i in range(numBoards):
                print("""\
Compartment Compartment%s {
    RDC RDC%s {
        Connector Connector%s {
            %s interface with type CustomType0;
        }
    }
}""" % (i, i, i, intCap), file=w)

            print("\n\nInterfaces {", file=w)

            for i in range(int(numItems)):
                for j in range(int(float(input.readline()))):
                    print("""\
    Interface I%s.%s {
        Type = CustomType0;
    }""" % (i, j), file=w)

            print("}\n", file=w)
    return w.name

def runAssist(inputs, args):
    procs = []
    for i in inputs:
        if not i:
            continue
        procs.append(subprocess.Popen(["java", "-jar", args.jar, i, "-s", str(args.solutions)],
                                      stdout=open(i+".log", 'w'), stderr=subprocess.STDOUT))
        if len(procs) == args.instances:
            if args.timeout == 0:
                for p in procs:
                    p.wait()
            else:
                time.sleep(args.timeout)
                for p in procs:
                    p.kill()
            procs = []

def getEntry(line):
    return line.split(">")[1].split("<")[0]

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('files', metavar='<file>', nargs='+',
                        help='files to parse')
    parser.add_argument("-n", "--number", type=int, help="set fixed number of bins/boards")
    parser.add_argument("-b", "--bin-scale", type=float, default=1.0, help="scale number of bins/boards")
    parser.add_argument("-c", "--capacity-scale", type=float, default=1.0, help="scale capacity of bins/boards")
    parser.add_argument("-r", "--bppc-results", help="results file for BPPC to read the bin number from")
    parser.add_argument("-j", "--jar", default=os.path.join(os.path.dirname(__file__), '..', 'ch.hilbri.assist.cli', 'assist_cli.jar'), help="jar file to start")
    parser.add_argument("-i", "--instances", type=int, default=0, help="number of parallel instances to start")
    parser.add_argument("-t", "--timeout", type=int, default=0, help="timeout in seconds")
    parser.add_argument("-s", "--solutions", type=int, default=1, help="number of solutions to find")
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
    mdsls = []
    for f in args.files:
        if zipfile.is_zipfile(f):
            zipf = zipfile.ZipFile(f)
            for z in zipf.namelist():
                mdsls.append(readFile(zipf.open(z)))
        else:
            mdsls.append(readFile(open(f)))

    if args.instances > 0:
        runAssist(mdsls, args)
