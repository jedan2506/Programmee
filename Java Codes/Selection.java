import java.util.*;
class Selection
{
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Numbers");
        int num[]=new int [10];
        for(int i=0;i<10;i++)
        {
            num[i]=Sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(num[i]);
        }
        for(int k=0;k<10;k++)
        {
            for (int l=k+1;l<10;l++)
            {
                int d=0;
                if (num[k]>num[l])
                {
                    d=num[k];
                    num[k]=num[l];
                    num[l]=d;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(num[i]);
        }
    }
}