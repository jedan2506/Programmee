import java.util.*;
class Sort
{
    int arr[]=new int[10];
    int item;
    void inpdata()
    {   
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Numbers");
        for(int i=0;i<10;i++)
        {   int l=Sc.nextInt();
            int count=0;
            for(int j=0;j<10;j++)
            {
                if(l!=arr[j])
                    count++;
            }
            if(count==10)
                arr[i]=l;
            else
            {
                System.out.println("Error");
                break; 
            }
        }
        /*for(int l=0;l<10;l++)
        { 
        System.out.println(arr[l]);
        }*/
    }

    void bubble()
    {
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

    void binsearch()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the item to be searched");
        int se=Sc.nextInt();
        int u=9;
        int n=0;
        int l=0;
        while(l<u)
        { 
            int mid=(u+l)/2;
            if(arr[mid]>se)
                u=mid-1;
            else if(arr[mid]<se)
                l=mid+1;
            else
            {
                n=mid+1;
                break;
            }
        }
        if(n==0)
            System.out.println("Item not found");
        else
            System.out.println("Item found at position"+n);

    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        Sort ob=new Sort();
        ob.inpdata();
        ob.bubble();
        ob.binsearch();
    }
}
