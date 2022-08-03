import java.util.*;
class Goldbach
{
    int n;
    Goldbach(int nn)
    {
        n=nn;
    }

    public void find()
    {
        for(int i=1;i<n;i=i+2)
        {
            int sum=0;
            for(int j=1;j<n;j=j+2)
            {
                sum=i+j;
                int check=0;
                if(sum==n)
                {
                    int check1=0;
                    int check2=0;
                    for(int k=1;k<=i;k++)
                    {
                        if(i%k==0)
                            check1++;
                    }
                    for(int k=1;k<=j;k++)
                    {
                        if(j%k==0)
                            check2++;
                    }
                    if((check1==2)&&(check2==2))
                        System.out.println(i+", "+j);
                }
            }
        }
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
        if((n>9)&&(n<50))
        {
            if(n%2==0)
            {
                Goldbach ob=new Goldbach(n);
                ob.find();
            }
            else
            {
                System.out.println("INVALID INPUT, NUMBER IS ODD");
                System.exit(0);
            }
        }
        else
            System.out.println("INVALID INPUT, NUMBER IS OUT OF RANGE");
    }
}