import java.util.*;
class Matrix
{
    int a[][];
    int m,n;
    Matrix(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }

    public void accept()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Sc.nextInt();
            }
        }
    }

    public void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sort()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                int k=0;
                if(a[i][j]>a[i][j+1])
                {
                    k=a[i][j];
                    a[i][j]=a[i][j+1];
                    a[i][j+1]=k;
                }
            }
        }
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int m=Sc.nextInt();
        System.out.println("Enter the Number of columns");
        int n=Sc.nextInt();
        System.out.println("Enter a string");
        /*String s=Sc.nextLine();
        int len=s.length();
        System.out.println("The length of the string '"+s+"' is:: "+len);*/
        Matrix ob=new Matrix(m,n);
        ob.accept();
        System.out.println("Original Matrix:: ");
        ob.print();
        ob.sort();
        System.out.println("Arranged Matrix:: ");
        ob.print();
    }
}