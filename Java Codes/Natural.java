import java .util.*;
class Natural
{   int n;int sum=0;
    Natural(int nn)
    {
        n=nn;
    }
    void check()
    {   int ch=0;String st="";
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        arr[i]=i+1;
        for (int j=0;j<n;j++)
        System.out.print(arr[j]+" ");
        System.out.println();
        for(int k=0;k<n;k++)
        {   sum=arr[k];
            st="";
            st=st+Integer.toString(arr[k]);
            for(int l=k+1;l<n;l++)
            {
                sum=sum+arr[l];
                st=st+" "+Integer.toString(arr[l]);
                if(sum==n)
                System.out.println(st);
                else if(sum>n)
                break;
                else if(sum<n)
                continue;
            }
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Number");
        int num=Sc.nextInt();
        Natural ob=new Natural(num);
        ob.check();
    }
}
    