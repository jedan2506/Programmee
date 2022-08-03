
import java.util.*;
class stack
{
    int num[];
    int a;
    int top=-1;int val=0;
    static Scanner Sc=new Scanner(System.in);
    stack(int aa)
    {
        a=aa;
        num=new int[a];
    }

    void push()
    {
        if(top==a)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            System.out.println("Enter an element");
            num[++top]=Sc.nextInt();
        }
    }

    void display()
    {
        for(int i=0;i<top+1;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    void pop()
    {
        if(top==-1)
            System.out.println("Underflow");
        else
        {
            val=num[top];
            top=top-1;
        }
    }

    public static void main()
    {
        System.out.println("Enter the size");
        int s=Sc.nextInt();
        stack ob=new stack(s);
        int n=0;
        do{
            System.out.println("Press 1 for pushing an element");
            System.out.println("Press 2 for poping an element");
            System.out.println("Press 3 for printing the elements");
            System.out.println("Press 4 to exit");
            n=Sc.nextInt();
            switch(n)
            {
                case 1: ob.push();
                break;
                case 2:ob.pop();
                System.out.println(ob.val);
                break;
                case 3:ob.display();
                break;
                default:System.out.println("Choose a valid option");
            }
        }
        while(n!=4);
    }
}