
import java.util.*;
class Bubble
{
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        int arr[]=new int [10];
        System.out.println("Enter the numbers");
        for (int i=0;i<10;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
        for(int l=0;l<10;l++)
        {
            for (int j=0;j<9;j++)
            {   int d=0;
                if(arr[j]>arr[j+1])
                {
                    d=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=d;
                }
            }
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}