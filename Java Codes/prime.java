import java .util.*;
class prime
{
    int num;int check=0;
    prime(int n)
    {
        num=n;
    }
    int recur(int i)
    {
        if(i==num+1)
        return 1;
        else
        {
           if(num%i==0)
           
           check++;
           return recur(++i);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Prime Number");
        int i=Sc.nextInt();
        prime ob=new prime(i);
        int n=ob.recur(1);
        if(ob.check==2)
        System.out.println("Yess");
        else
        System.out.println("Nooo");
    }
}