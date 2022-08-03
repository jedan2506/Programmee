lst = []
for i in range(4):
    n = input("Enter the Element:: ")
    lst.append(n)

sear = input("Enter the Element to be searched:: ")
j = 0
for i in range(4):
    if(lst[i] == sear):
        print("Found")
        j = 1
if(j == 0):
    print("Not Found")
