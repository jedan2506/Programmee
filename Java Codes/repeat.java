import java .util.*;
class repeat
{
    int sum=0;
    int mul;
    int num;
    repeat(int m,int n)
    {
        mul=m;
        num=n;
    }
    int check(int i)
    {
        if(i==mul)
        return sum;
        else
        {
            sum=sum+num;
            return check(++i);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        System.out.println("Enter the power");
        int m=Sc.nextInt();
        repeat ob=new repeat(n,m);
        int n1=ob.check(0);
        System.out.println();
        System.out.println("Sum:: "+n1);
    }
}