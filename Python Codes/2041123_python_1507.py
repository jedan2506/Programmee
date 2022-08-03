def addition(a,b):
    return a+b

def subs(a,b):
    return a-b

def multi(a,b):
    return a*b

def div(a,b):
    return a/b

def modulus(a,b):
    return a%b
    
def switch(choice,a,b):
    dict={
        1: addition(a,b),
        2: subs(a,b),
        3: multi(a,b),
        4: div(a,b),
        5: modulus(a,b)
        }
    return dict.get(choice, 'Invalid Operation')

a=int(input("Enter the First Number:: "))
b=int(input("Enter the Second Number:: "))
print()
print('''Choose any of the Following::
Press 1 for Addition
Press 2 for Subtraction
Press 3 for Multiplication
Press 4 for Division
Press 5 for Modulus
''')
print()
ch=int(input("Enter your Choice:: "))
print("Your Answer is:: ",switch(ch,a,b))