import java .util.*;
class dig
{
    int digit=0;
    int sum=0;
    int check(int num)
    {
        if(num==0)
        return sum;
        else
        {
            digit=num%10;
            sum=sum+digit;
            return check(num/10);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
        dig ob=new dig();
        int n1=ob.check(n);
        System.out.println();
        System.out.println("Sum of the Digits:: "+n1);
    }
}