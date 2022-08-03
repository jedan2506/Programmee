import java.util.*;
class Test extends Test_abstract
{
    double n1,n2;
    Test (double s1,double s2)
    {
        n1=s1;
        n2=s2;
    }

    public void cal()
    {
        d=n1*n2;
        System.out.println(d);
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        double n1=Sc.nextDouble();
        double n2=Sc.nextDouble();
        Test ob=new Test(n1,n2);
        ob.out();
        ob.cal();
    }
}