import java .util.*;
class i implements i1,i2
{
    int i,j;
    i()
    {
        i=0;
        j=0;
    }

    public void out()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        i=Sc.nextInt();
    }

    public void input()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the second number");
        j=Sc.nextInt();
    }

    public void print(int l)
    {
        System.out.println("First Number:: "+i);
        System.out.println("Second Number:: "+j);
        System.out.println("Third Number:: "+l);
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        i ob=new i();
        ob.out();
        ob.input();
        System.out.println("Enter the third number");
        int k=Sc.nextInt();
        ob.print(k);
    }
}