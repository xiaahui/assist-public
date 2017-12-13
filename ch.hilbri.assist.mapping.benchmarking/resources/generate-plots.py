import numpy as np
import matplotlib.pyplot as plt


examples = np.arange(21)
width = 0.25

constraints_full = []
variables_full = []
fails_full = []
backtracks_full = []
resolution_full = []

constraints_inst_only = []
variables_inst_only = []
fails_inst_only = []
backtracks_inst_only = []
resolution_inst_only = []

constraints_union = []
variables_union = []
fails_union = []
backtracks_union = []
resolution_union = []

file = open("results-imac2-full.txt", "r")
for line in file:
    constraints = int(line.split(': ')[1].split(', ')[0].split(' ')[0])
    variables = int(line.split(': ')[1].split(', ')[1].split(' ')[0])
    fails = int(line.split(': ')[1].split(', ')[2].split(' ')[0])
    backtracks = int(line.split(': ')[1].split(', ')[3].split(' ')[0])
    resolution = float(line.split(': ')[1].split(', ')[4].split(' ')[0])

    constraints_full.append(constraints)
    variables_full.append(variables)
    fails_full.append(fails)
    backtracks_full.append(backtracks)
    resolution_full.append(resolution)
file.close()

file = open("results-imac2-inst-only.txt", "r")
for line in file:
    constraints = int(line.split(': ')[1].split(', ')[0].split(' ')[0])
    variables = int(line.split(': ')[1].split(', ')[1].split(' ')[0])
    fails = int(line.split(': ')[1].split(', ')[2].split(' ')[0])
    backtracks = int(line.split(': ')[1].split(', ')[3].split(' ')[0])
    resolution = float(line.split(': ')[1].split(', ')[4].split(' ')[0])

    constraints_inst_only.append(constraints)
    variables_inst_only.append(variables)
    fails_inst_only.append(fails)
    backtracks_inst_only.append(backtracks)
    resolution_inst_only.append(resolution)
file.close()

file = open("results-imac2-union.txt", "r")
for line in file:
    constraints = int(line.split(': ')[1].split(', ')[0].split(' ')[0])
    variables = int(line.split(': ')[1].split(', ')[1].split(' ')[0])
    fails = int(line.split(': ')[1].split(', ')[2].split(' ')[0])
    backtracks = int(line.split(': ')[1].split(', ')[3].split(' ')[0])
    resolution = float(line.split(': ')[1].split(', ')[4].split(' ')[0])

    constraints_union.append(constraints)
    variables_union.append(variables)
    fails_union.append(fails)
    backtracks_union.append(backtracks)
    resolution_union.append(resolution)
file.close()

fig, ax = plt.subplots()

ax.bar(examples - 0.5 * width, constraints_full, width, color='r')
ax.bar(examples + 0.5 * width, constraints_inst_only, width, color='b')
ax.bar(examples + 1.5 * width, constraints_union, width, color='g')

ax.set_ylabel('Constraints')
ax.set_xlabel('Example')
ax.set_title('Constraints in all examples')
ax.set_xticks(examples + width / 2)
ax.set_xticklabels(np.arange(21))
plt.show()
