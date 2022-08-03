import java.util.*;
class tions extends connec
{
    int add;
    int sub;
    tions(int i1,int i2)
    {
        super(i1,i2);
        add=0;
        sub=0;
    }
    public void cal()
    {
        super.cal();
        add=i1+i2;
        sub=i1-i2;
    }
    void print()
    {
        System.out.println("Addition:: "+add);
        System.out.println("Subtraction:: "+sub);
        System.out.println("Multiplication:: "+mul);
        System.out.println("Division:: "+div);
    }
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the first number");
        int a=Sc.nextInt();
        System.out.println("Enter the second number");
        int b=Sc.nextInt();
        tions ob=new tions(a,b);
        ob.cal();
        ob.print();
    }
}