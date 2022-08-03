from re import S


class First(object):

    def __init__(self, st):
        self.nst = ""
        self.s = st

    def reverse(self):
        print("Original String:: ", self.s)
        for i in self.s:
            self.nst = i+self.nst
        return self.nst


class Second (First):

    def choice(st):
        print('''Please Press one of the Following Options::
        1 to Lower Case
        2 to Upper Case
        3 to Title Case
        4 to Count the number of times a value appeared in a String
        5 to Find the position of a value in a String
        6 to Swap Cases
        7 for Partitioning the String into Three Tuples
        8 to Replace
        9 to Find the Length of the String
        10 to Check some cases
        11 to get the Reverse of a String
        12 to Check whether the Entered String is a Palindrome or not
        13 to Concatenate Two Strings
        14 to Remove Duplicate Characters in a String''')
        ch = int(input("OPTION:: "))
        print()
        print("The Original Text:: ", st, "\n")

        match ch:
            case 1: print("Lower Case:: ", st.lower())

            case 2: print("Upper Case:: ", st.upper())

            case 3: print("Title Case:: ", st.title())

            case 4:
                s = input("Enter Another String:: ")
                print("The word '", s, "' appeared:: ", st.count(s), " times")

            case 5:
                s = input("Enter Another String:: ")
                print("The word '", s, "' appeared at ",
                      st.find(s), " position")

            case 6: print("Swapping Cases:: ", st.swapcase())

            case 7:
                s = input("Enter Another String to Partition:: ")
                print("The Different Partitions are:: ", st.partition(s))

            case 8:
                s1 = input("Enter the String to Replace:: ")
                s2 = input("Enter the New Word:: ")
                print("Title Case:: ", st.replace(s1, s2))

            case 9:
                print("The Length of the Entered String is:: ", len(st))

            case 10:
                print("Is the Entered String Upper Case:: ", st.isupper())
                print("Is the Entered String Lower Case:: ", st.islower())
                print("Are all the Characters Whitespaces:: ", st.isspace())

            case 11:
                s = input("Enter the String to get its Reverse:: ")
                obj = First(s)
                s = obj.reverse()
                print("The Reversed String is:: ", s)

            case 12:
                s = input("Enter the String to get its Reverse:: ")
                obj1 = First(s)
                s1 = obj1.reverse()
                if(s == s1):
                    print("Yes, ", s, " is a Palindrome String")
                else:
                    print("No, ", s, " is not a Palindrome String")

            case 13:
                s = input(
                    "Enter a String to concatenate with the Prvious String:: ")
                s = st+(s)
                print("The Concatenated String is:: ", s)

            case 14:
                list = [st[0]]
                s = st[0]
                for i in st:
                    check = 0
                    for j in list:
                        if(i == j):
                            check = check+1
                    if(check == 0):
                        s = s+i
                        list.append(i)

                print("The New String is:: ", s)

            case other: print("Abbey Saale!! Please Choose a Valid Option")

    i = 1
    str = input("Please Enter the String:: ")
    while (i == 1):
        choice(str)
        i = int(input("\nPress 1 to Continue:: "))

    print("Thank You for using the Program")
