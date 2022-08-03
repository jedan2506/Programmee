import java.util.*;
class Combine
{
    int com[];
    int size;
    Combine(int nm)
    {
        size=nm;
        com=new int[size];
    }

    void inputarray()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            com[i]=Sc.nextInt();
        }
    }

    void mix(Combine ob1,Combine ob2)
    {
        int count=-1;
        for(int i=0;i<ob1.size;i++)
        {
            count++;
            com[count]=ob1.com[i]; 
        }
        
        for(int i=0;i<ob2.size;i++)
        {
            count++;
            com[count]=ob2.com[i]; 
        }
    }

    void sort()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                int k=0;
                if(com[i]>com[j])
                {
                    k=com[i];
                    com[i]=com[j];
                    com[j]=k;
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1=Sc.nextInt();
        System.out.println("Enter the size of the second array");
        int size2=Sc.nextInt();
        Combine ob1=new Combine(size1);
        Combine ob2=new Combine(size2);
        Combine ob3=new Combine(size1+size2);
        ob1.inputarray();
        ob2.inputarray();
        System.out.print("First Array:: ");
        ob1.display();
        System.out.print("Second Array:: ");
        ob2.display();
        ob3.mix(ob1,ob2);
        ob3.sort();
        System.out.print("Final Array:: ");
        ob3.display();
    }
}
