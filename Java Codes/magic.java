import java.util.*;
class magic
{
    int[] count()
    {
        int j,digit,sum;
        int n[]=new int[11];
        int c=0;
        for(int i=1;i<=100;i++)
        {
            digit=0;
            sum=0;
            j=i;
            while(j>=10)
            {
                sum=0;
                while(j>0)
                {
                    digit=j%10;
                    sum=sum+digit;
                    j=j/10;
                }
                j=sum;
                if(j<10)
                break;
            }
            if(sum==1)
            {
                n[c]=i;
                c++;
            }
        }
        return n;
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        int a[]=new int[11];
        magic ob=new magic();
        a=ob.count();
        System.out.print("The magic numbers are:: ");
        for(int j=0;j<11;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}