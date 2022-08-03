import java.util.*;
class Collection
{
    int arr[];
    int len;
    Collection()
    {
        len=3;
        arr=new int[3];
    }

    Collection(int l)
    {
        len=l;
        arr=new int[len];
    }

    void inparr()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Elements");
        for(int i=0;i<len;i++)
        {
            arr[i]=Sc.nextInt();
        }
    }

    Collection common(Collection ob2)
    {
        Collection ob3=new Collection(len);
        int p=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<ob2.len;j++)
            {
                if((arr[i])==(ob2.arr[j]))
                {
                    ob3.arr[p]=arr[i];
                    p++;
                    break;
                }
            }
        }
        ob3.len=p;
        return ob3;
    }

    void arrange()
    {
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len-1;j++)
            {
                int k=0;
                if(arr[i]>arr[j])
                {
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int len1=Sc.nextInt();
        Collection ob1=new Collection();
        Collection ob2=new Collection(len1);
        ob1.inparr();
        ob2.inparr();
        System.out.print("First Array:: ");
        ob1.display();
        System.out.print("Second Array:: ");
        ob2.display();
        Collection ob3=ob1.common(ob2);
        ob3.arrange();
        System.out.print("First Array:: ");
        ob3.display();
    }
}
