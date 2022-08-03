import java.util.*;
class Mixer
{
    int arr[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void accept()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Elements");
        int count=-1;
        for(int i=0;i<n;i++)
        {
            count++;
            int count1=0;
            int in=Sc.nextInt();
            for(int j=0;j<count;j++)
            {
                if(in!=arr[j])
                {
                    count1++;
                }
            }
            if(count1==count)
                arr[i]=in;
            else if (count==n)
                break;
        }
    }

    Mixer mix(Mixer ob1)
    {
        int count=-1;
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the length of the second array");
        int a=Sc.nextInt();
        int total=a+n;
        System.out.println("Size:: "+total);
        Mixer ob2=new Mixer(total);
        for(int i=0;i<n;i++)
        {
            count++;
            ob2.arr[count]=arr[i]; 
        }

        System.out.println("Enter the elements now");
        for(int i=count+1;i<total;i++)
        {
            ob2.arr[i]=Sc.nextInt();
        }
        
        return ob2;
    }

    void sort()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
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
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the n of the first array");
        int n1=Sc.nextInt();
        Mixer ob1=new Mixer(n1);
        ob1.accept();
        ob1.sort();
        ob1.display();
        Mixer ob2=ob1.mix(ob1);
        ob2.display();
    }
}
