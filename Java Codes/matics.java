import java.util.*;
class matics extends Mathe
{
    int sum=0;
    int sub=0;
    matics(int n,int m)
    {
        super (n,m);
    }
    public void calculate()
    {
        super.calculate();
        sum=n1+n2;
        sub=n1-n2;
    }
    public void display()
    {
        System.out.println("Addition:: "+sum);
        System.out.println("Substract:: "+sub);
        super.display();
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        matics ob=new matics(n1,n2);
        ob.calculate();
        ob.display();
    }
}