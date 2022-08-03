import java.util.*;
class Pattern
{
    int n;
    Pattern(int nn)
    {
        n=nn;
    }

    public void First()
    {
        int check=1;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0)&&(j%3!=0))
                    System.out.print("."+" ");
                else if((i==1)&&(j%3==0))
                {
                    System.out.print("."+" ");
                    //if((i==1)&&(i+j==check))
                    //check=check+2;
                }
                else if(i+j==n)
                    System.out.print("."+" ");
                else if(i+j==check)
                {
                    check=check+2;
                    System.out.print("."+j+" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number of Columns");
        int n=Sc.nextInt();
        Pattern ob=new Pattern(n);
        ob.First();
    }
}