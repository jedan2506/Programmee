import java .util.*;
class Que
{
    int front=-1;
    int rear=-1;
    int val=0;
    int que[];
    int a;
    static Scanner Sc=new Scanner(System.in);
    Que(int aa)
    {
        a=aa;
        que=new int[a];
    }

    void push()
    {
        if(rear==-1)
        {
            front=0;
            rear=0;
            que[rear]=Sc.nextInt();
            //rear++;
        }
        else if(rear==a)
            System.out.println("Overflow");
        else
        {
            System.out.println("Enter the Element");
            que[++rear]=Sc.nextInt();
            //rear++;
        }
        System.out.println();
    }

    void pop()
    {
        if(front==-1)
        {
            System.out.println("Underflow");
            val=0;
        }
        else if(front==rear)
        {
            val=que[front];
            front=-1;
        }
        else
        {
            val=que[front];
            front=front+1;
        }
    }

    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(que[i]+" ");
        }
        System.out.println();
    }

    public static void main()
    {
        System.out.println("Enter the size");
        int s=Sc.nextInt();
        Que ob=new Que(s);
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
                case 4:System.exit(0);
                break;
                default:System.out.println("Choose a valid option");
            }
        }
        while(n<5);
    }
}