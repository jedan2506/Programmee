import java.util.*;
class raise
{
    int p;int n1;
    int num=1;
    raise(int p1,int n)
    {
        p=p1;
        n1=n;
    }
    int check(int i)
    {
        if(i==p)
        return num;
        else
        {
            num=num*n1;
            return check(++i);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n2=Sc.nextInt();
        System.out.println("Enter the power");
        int p2=Sc.nextInt();
        raise ob=new raise(p2,n2);
        int n=ob.check(0);
        System.out.println();
        System.out.println("Final Value:: "+n);
    }
}