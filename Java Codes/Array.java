import java .util.*;
class Array
{
    char c[][];
    int n;
    char c1,c2,c3;
    Array(int nn,char cc1,char cc2,char cc3)
    {
        n=nn;
        c=new char[n][n];
        c1=cc1;
        c2=cc2;
        c3=cc3;
    }
    public void create()
    {
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<n;l++)
            {
                c[k][l]=c3;
            }
        }
        for(int i=0;i<n;i++)
        {
            c[i][0]=c2;
            c[i][n-1]=c2;
            c[0][i]=c2;
            c[n-1][i]=c2;
        }
        c[0][n-1]=c1;
        c[0][0]=c1;
        c[n-1][0]=c1;
        c[n-1][n-1]=c1;
    }
    public void display()
    {
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
    }
    public static void main ()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=Sc.nextInt();
        System.out.println("Enter the First Character");
        char c1=Sc.next().charAt(0);
        System.out.println("Enter the Second Character");
        char c2=Sc.next().charAt(0);
        System.out.println("Enter the Third Character");
        char c3=Sc.next().charAt(0);
        if((n>3)&&(n<10))
        {
            Array ob=new Array(n,c1,c2,c3);
            ob.create();
            ob.display();
        }
    }
}