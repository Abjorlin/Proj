import pylab
import matplotlib.pyplot as plt


with open("degreedata.txt","r") as file:
    size = []
    occurance = []
    for line in file:
        temp = line.rstrip().split(" ")
        size.append(temp[0])
        occurance.append(int(temp[3]))
                            

with open("componentsizedata.txt","r") as file2:
    size2 = []
    occurance2 = []
    for line2 in file2:
        temp2 = line2.rstrip().split(" ")
        size2.append(temp2[3])
        occurance2.append(int(temp2[5]))

plt.clf()

fig = plt.figure()
ax = fig.add_subplot(1, 1, 1)
ax.bar(size,occurance)
ax.axes.get_xaxis().set_ticks([0,797//4,797/2,3*797/4,797])
ax.set_yscale('log')

pylab.show()


fig2 = plt.figure()
ax2 = fig2.add_subplot(1, 1, 1)
ax2.bar(size2,occurance2)
ax2.axes.get_xaxis().set_ticks([0,467//4,467//2,3*467//4,467])
ax2.set_yscale('log')

pylab.show()
