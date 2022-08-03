import java .util.*;
class Wages extends Worker
{
    int hrs;
    int rate;
    double wage;
    Wages(int h,int r,String n,double b)
    {
        super (n,b);
        hrs=h;
        rate=r;
        wage=0;
    }

    double overtime()
    {
        double over=hrs*rate;
        return over;
    }

    void display()
    {
        double o=overtime();
        wage=o+Basic;
        System.out.println("Wages:: "+wage);
    }

    public static void main ()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the name of the Worker");
        String s=Sc.nextLine();
        System.out.println("Enter the pay of the Worker");
        double pay=Sc.nextDouble();
        System.out.println("Enter the hrs");
        int h=Sc.nextInt();
        System.out.println("Enter the rate");
        int r=Sc.nextInt();
        Wages ob=new Wages(h,r,s,pay);
        double d=ob.overtime();
        ob.display();
    }
}