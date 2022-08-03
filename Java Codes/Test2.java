import java.util.*;
class Test2 extends Test2_abstract
{
    int marks[];
    Test2()
    {
        marks=new int[2];
    }

    public void inp()
    {
        Scanner Sc=new Scanner (System.in);
        for(int i=0;i<2;i++)
        {
            marks[i]=Sc.nextInt();
        }
    }

    public void out()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println(name[i]);
            out1(i);
        }
    }

    public void out1(int i)
    {
        System.out.println(marks[i]);
    }

    public static void main()
    {
        Test2 ob=new Test2();
        int i=0;
        ob.in();
        ob.inp();
        ob.out();
    }
}