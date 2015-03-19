#!/usr/bin/env python
# This script reads assist logs and extracts timing information

from __future__ import print_function
import argparse, glob, re

def readFile(inFile, out):
    maxInst = 0
    numVars = 0
    for line in inFile:
        if "Unsorted variables list:" in line:
            numVars = line.count(",")
        if "% of all variables instantiated" in line:
            maxInst = max(maxInst, int(line.split()[-5][1:-1]))
        if "Internal solver statistics" in line:
            m = re.search("Building time : (\d+,\d+)s, Initialisation : \d+,\d+s, Initial propagation : \d+,\d+s, Total (\d+,\d+)s, \d+ Nodes, (\d+) Backtracks, \d+ Fails", line)
            print(";".join(inFile.name.split("\\") + [str(numVars)] + list(m.groups())), file=out)
            return
    print(";".join(inFile.name.split("\\") + [str(numVars), "%s%%" % maxInst, str(numVars * maxInst / 100.), "not finished"]), file=out)

def filterInstance(log, mdslIn, mdslOut):
    ifaces = set()
    ifaceGroups = set()
    skip = 0
    if log:
        for line in log:
            if "Instantiated variables list" in line:
                s = line.split(", ")
                s[0] = s[0].split(": [")[1]
                s[-1] = s[-1].split("]")[0]
                ifaces.update(set([i.split("-")[1] for i in s if i]))
    else:
        for line in mdslIn:
            if "Group " in line:
                s = line.split(",")
                s[0] = s[0].split("{ ")[1]
                s[-1] = s[-1].split(" }")[0]
                ifaces.update(set(s))
                ifaceGroups.add(line.split()[1])
        mdslIn.seek(0)
    print(len(ifaces))
    for line in mdslIn:
        if "Name = " in line:
            mdslOut.write(line)
        elif "Group " in line:
            s = line.split(",")
            s[0] = s[0].split("{ ")[1]
            s[-1] = s[-1].split(" }")[0]
            for i in s:
                if i in ifaces:
                    ifaceGroups.add(line.split()[1])
                    break
            mdslOut.write(line)
        elif "dislocal" in line or "on same" in line:
            s = line.split()[0].split(",")
            found = False
            for i in s:
                if i in ifaces or i in ifaceGroups:
                    found = True
                    break
            if found:
                mdslOut.write(line)
        else:
            if not log and "Interface " in line:
                if line.split()[1] not in ifaces:
                    skip = 4
            if skip > 0:
                skip -= 1
            else:
                mdslOut.write(line)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('logs', metavar='<log>', nargs='*',
                        help='logs to parse')
    parser.add_argument("-o", "--output", default="results.csv", help="output file")
    parser.add_argument("-m", "--mdsl", help="input instance")
    args = parser.parse_args()

    if args.mdsl:
        filterInstance(open(args.logs[0]) if args.logs else None, open(args.mdsl), open(args.mdsl[:-5] + "_redux.mdsl", 'w'))
    else:
        with open(args.output, 'w') as out:
            for f in args.logs:
                if "*" in f or "?" in f:
                    for z in glob.glob(f):
                        readFile(open(z), out)
                else:
                    readFile(open(f), out)
    
