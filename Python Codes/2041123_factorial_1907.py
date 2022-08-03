num=int(input("Enter the Number for which you need Factorial:: "))
fact=1
if(num==0):
    print("Factorial of 0 is 1")
elif(num<0):
    print("Sorry can't find the factorial of a Negative Number")
else:
    for i in range(1,num+1):
        fact=fact*i
    print("Your Answer is:: ",fact)