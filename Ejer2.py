x=[0]*4
sc=input().split()
for i in range(4):
	x[i]=int(sc[i])
x.sort()
print(x[2])
