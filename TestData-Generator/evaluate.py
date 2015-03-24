#!/usr/bin/env python
# This script reads assist logs and extracts timing information

from __future__ import print_function
import argparse, glob, re

class MDSL:
    def __init__(self):
        self.hardware = {}
        self.ifaces = {}
        self.ifaceGroups = {}
        self.coloc = []
        self.disloc = []
        self.masterSol = {}

def readFile(inFile, out):
    maxInst = 0
    numVars = 0
    result = ["0", "not finished"]
    for line in inFile:
        if "Unsorted variables list:" in line:
            numVars = line.count(",")
        if "% of all variables instantiated" in line:
            maxInst = max(maxInst, int(line.split()[-5][1:-1]))
        if "Internal solver statistics" in line:
            m = re.search("(\d+) Solutions, Building time : (\d+,\d+)s, Initialisation : \d+,\d+s, Initial propagation : \d+,\d+s, Total (\d+,\d+)s, \d+ Nodes, (\d+) Backtracks, \d+ Fails", line)
            result = list(m.groups())
            break
    print(";".join(inFile.name.split("\\") + [str(numVars), "%s%%" % maxInst, str(numVars * maxInst / 100.)] + result), file=out)

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

def parseMDSL(mdslIn):
    mdsl = MDSL()
    current = None
    curIface = None
    levels = ("Connector;", "RDC;", "Compartment;")
    for line in mdslIn:
        if "Compartment " in line:
            current = [line.split()[1], "", ""]
            mdsl.hardware[current[0]] = {}
        elif "RDC " in line:
            current[1] = line.split()[1]
            mdsl.hardware[current[0]][current[1]] = {}
        elif "Connector " in line:
            current[2] = line.split()[1]
            mdsl.hardware[current[0]][current[1]][current[2]] = {}
        elif current and "=" in line:
            t, c = [e.strip() for e in line.split(" = ")]
            mdsl.hardware[current[0]][current[1]][current[2]][t] = int(c[:-1])
        elif "Interfaces " in line:
            current = None
        elif "Interface " in line:
            curIface = line.split()[1]
            if " placement " in line:
                mdsl.masterSol[curIface] = line.split()[-1].split(".") 
        elif "Type = " in line:
            mdsl.ifaces[curIface] = line.split()[2][:-1]
        elif "Group " in line:
            s = line.split(",")
            s[0] = s[0].split("{ ")[1]
            s[-1] = s[-1].split(" }")[0]
            mdsl.ifaceGroups[line.split()[1]] = s
        elif " dislocal up to " in line or " on same " in line:
            s = line.split()[0].split(",")
            level = levels.index(line.split()[-1])
            if "dislocal" in line:
                mdsl.disloc.append((s,level))
            else:
                mdsl.coloc.append((s,level))
    return mdsl

def checkSolution(mdsl, sol):
    numSol = None
    solution = {}
    for line in sol:
        if "solutions found" in line:
            numSol = int(line.split()[0])
            if numSol == 0:
                print("No solution found in %s!" % sol.name)
                return False
        elif numSol:
            if not "{" in line:
                break
            if "," in line:
                s = line.split(",")[:-1]
                s[0] = s[0].split("{ ")[1]
                solution[line.split()[0]] = s
    if numSol is None:
        print("No solution found in %s!" % sol.name)
        return False
    masterOverlap = 0
    # check types and multiple assignment
    count = {}
    assigned = {}
    for hw, ifaceList in solution.iteritems():
        comp, rdc, conn = hw.split(".")
        for iface in ifaceList:
            t = mdsl.ifaces[iface]
            if iface in assigned:
                print("Multiple assignments of interface %s!" % iface)
                return False
            assigned[iface] = hw.split(".")
            if assigned[iface] == mdsl.masterSol.get(iface, None):
                masterOverlap += 1
            key = "%s.%s" % (hw, t)
            if key not in count:
                count[key] = mdsl.hardware[comp][rdc][conn].get(t, 0)
            count[key] -= 1
            if count[key] < 0:
                print("No space for interface %s on %s!" % (iface, key))
                return False
    unassigned = set(mdsl.ifaces).difference(assigned.keys())
    if unassigned:
        print("The following interfaces were not assigned: %s!" % ",".join(unassigned))
        return False
    # check colocalities
    for s, level in mdsl.coloc:
        assignedTo = assigned[s[0]][:3-level]
        for iface in s[1:]:
            if assigned[iface][:3-level] != assignedTo:
                print("%s violates colocation %s on level %s" % (iface, s, level))
                return False
    # check dislocalities
    for s, level in mdsl.disloc:
        for idx, g1 in enumerate(s):
            for if1 in mdsl.ifaceGroups[g1]:
                assignedTo = assigned[if1][:3-level]
                for g2 in s[idx+1:]:
                    for if2 in mdsl.ifaceGroups[g2]:
                        if assigned[if2][:3-level] == assignedTo:
                            print("(%s,%s) in groups (%s,%s) violate dislocation %s on level %s" % (if1, if2, g1, g2, s, level))
                            return False
    if mdsl.masterSol:
        print("%.2f%% overlap with master solution." % (100. * masterOverlap / len(mdsl.masterSol)))
    return True

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('logs', metavar='<log>', nargs='*',
                        help='logs to parse')
    parser.add_argument("-o", "--output", default="results.csv", help="output file")
    parser.add_argument("-m", "--mdsl", help="input instance")
    parser.add_argument("-s", "--solution", help="solutions to check")
    args = parser.parse_args()

    if args.mdsl:
        if args.solution:
            instance = parseMDSL(open(args.mdsl))
            for sol in args.solution.split(","):
                if checkSolution(instance, open(sol)):
                    print("%s is valid for %s" % (sol, args.mdsl))
                else:
                    print("%s is not valid for %s" % (sol, args.mdsl))
        else:
            filterInstance(open(args.logs[0]) if args.logs else None, open(args.mdsl), open(args.mdsl[:-5] + "_redux.mdsl", 'w'))
    else:
        with open(args.output, 'w') as out:
            for f in args.logs:
                if "*" in f or "?" in f:
                    for z in glob.glob(f):
                        readFile(open(z), out)
                else:
                    readFile(open(f), out)
