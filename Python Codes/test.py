def addition(num1, num2):
    return num1 + num2
def subtraction(num1, num2):
    return num1 - num2
def multiply(num1, num2):
    return num1 * num2
def realDivision(num1, num2):
    return num1 / num2
def intDivision(num1, num2):
    return num1 // num2
def modulus(num1, num2):
    return num1 % num2

# Defining the switch function

def switch(operation, num1, num2):

    dict={
        1: addition(num1, num2),
        2: subtraction(num1, num2),
        3: multiply(num1, num2),
        4: realDivision(num1, num2),
        5: intDivision(num1, num2),
        6: modulus(num1, num2)
    }
    return dict.get(operation, 'Invalid Operation')

# Taking the operands from the users

num1= int(input('Enter the first number: '))
num2= int(input('Enter the second number: '))

# Taking user input to choose an operation

print('''Press 1 for Addition
Press 2 for Subtraction
Press 3 for Multiplication
Press 4 for real number Division
Press 5 for integer Division
Press 6 for finding the remainder after division''')
num= int(input('Enter a number of your choice: '))

# Calling the switch function
print('Result is: ', switch(num, num1, num2))