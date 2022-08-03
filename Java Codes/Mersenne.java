import java .util.*;
class Mersenne
{
    int n;
    Mersenne(int nn)
    {
        n=nn;
    }
    void single()
    {
        System.out.println("The elements are(single):: ");
        for(int i=1;i<=n;i++)
        {
            System.out.print((int)(Math.pow(2,i)-1)+" ");
        }
        System.out.println();
    }
    void doubles()
    {
        System.out.println("The elements are(double):: ");
        for(int i=1;i<=n;i++)
        {
            System.out.print((int)(Math.pow(2,(Math.pow(2,i)-1))-1)+" ");
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of numbers you require");
        int n=Sc.nextInt();
        Mersenne ob=new Mersenne(n);
        ob.single();
        ob.doubles();
    }
}