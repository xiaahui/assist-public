#!/usr/bin/env python
# This script converts bin packing instances from http://people.brunel.ac.uk/~mastjjb/jeb/orlib/binpackinfo.html
# to assist instances

from __future__ import print_function
import os, argparse, zipfile, subprocess, time

def readBPPC(numItems, cap, inFile, bound):
    base = os.path.basename(inFile.name)
    intCap = int(cap * args.capacity_scale)
    numBoards = args.number if args.number else int(bound[base] * args.bin_scale)
    items = []
    with open(base[:-4] + ".mdsl", 'w') as w:
        print("""\
Global {
    Name = "Binpack with conflicts System %s";
}""" % base, file=w)

        for i in range(numBoards):
            print("""\
Compartment Compartment%s {
    RDC RDC%s {
        Connector Connector%s {
            CustomType0 = %s;
        }
    }
}""" % (i, i, i, intCap), file=w)

        print("\n\nInterfaces {", file=w)
        interfaces = {}
        for i in range(int(numItems)):
            items.append(inFile.readline().split())
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

def readFile(inFile):
    result = []
    first = inFile.readline().split()
    try:
        f0 = int(first[0])
    except:
        return [None]
    if len(first) == 2:
        return readBPPC(f0, float(first[1]), inFile, bound)
    print("Converting %s problems from %s" % (f0, f))
    for _ in xrange(f0):
        desc = inFile.readline().strip()
        cap, numItems, numBins = [float(x) for x in inFile.readline().split()]
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
            CustomType0 = %s;
        }
    }
}""" % (i, i, i, intCap), file=w)

            print("\n\nInterfaces {", file=w)
            interfaces = {}
            for i in range(int(numItems)):
                interfaces[i] = []
                for j in range(int(float(inFile.readline()))):
                    interfaces[i].append("I%s_%s" % (i, j))
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

            print("}\n", file=w)
            result.append(w.name)
    return result

def waitForRemaining(procs, args):
    initialSize = len(procs)
    while len(procs) == initialSize:
        time.sleep(10)
        for p in list(procs):
            if p.poll() is not None:
                procs.remove(p)

def runAssist(inputs, args):
    java = "java"
    if "JAVA_HOME" in os.environ:
        java = os.path.join(os.environ["JAVA_HOME"].strip('"'), "bin", java)
    procs = set()
    for i in inputs:
        if not i:
            continue
        assistArgs = ["-s", str(args.solutions), "-l", str(args.level), "-a", str(args.strategy), "-t", str(args.timeout)]
        if args.optimized:
            assistArgs.append("-O")
        print([java, "-jar", args.jar, i] + assistArgs)
        procs.add(subprocess.Popen([java, "-jar", args.jar, i] + assistArgs,
                                   stdout=open(i+".log", 'w'), stderr=subprocess.STDOUT))
        if len(procs) == args.instances:
            waitForRemaining(procs, args)
    while(procs):
        waitForRemaining(procs, args)

def getEntry(line):
    return line.split(">")[1].split("<")[0]

def addArgs(parser):
    parser.add_argument("-j", "--jar", default=os.path.join(os.path.dirname(__file__), '..', 'ch.hilbri.assist.cli', 'assist_cli.jar'), help="jar file to start")
    parser.add_argument("-i", "--instances", type=int, default=0, help="number of parallel instances to start")
    parser.add_argument("-t", "--timeout", type=int, default=0, help="timeout in seconds")
    parser.add_argument("-s", "--solutions", type=int, default=1, help="number of solutions to find")
    parser.add_argument("-l", "--level", type=int, default=0, help="hardware level(s) to use for location variables")
    parser.add_argument("-a", "--strategy", default="default", help="variable selection strategy")
    parser.add_argument("-O", "--optimized", action="store_true", help="switch on all internal optimizations")

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('files', metavar='<file>', nargs='+',
                        help='files to parse')
    parser.add_argument("-n", "--number", type=int, help="set fixed number of bins/boards")
    parser.add_argument("-b", "--bin-scale", type=float, default=1.0, help="scale number of bins/boards")
    parser.add_argument("-c", "--capacity-scale", type=float, default=1.0, help="scale capacity of bins/boards")
    parser.add_argument("-r", "--bppc-results", help="results file for BPPC to read the bin number from")
    addArgs(parser)
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
                mdsls += readFile(zipf.open(z))
        else:
            mdsls += readFile(open(f))

    if args.instances > 0:
        runAssist(mdsls, args)
