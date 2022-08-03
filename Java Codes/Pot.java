import java .util.*;
class Pot
{
    String st;
    int len;
    int arr[];
    String word[];
    int check=0;
    Pot(String s,int l)
    {
        st=s;
        len=l;
        arr=new int [len];
        word=new String[len];
    }

    public void potential(String s)
    {
        int sum=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            sum=sum+(int)s.charAt(i);
        }
        System.out.println(s+":: "+sum);
        arr[check]=sum;
        word[check]=s;
        check++;
    }

    public void sort()
    {
        for(int i=0;i<len;i++)
        {   int d=0;
            String s="";
            for(int j=0;j<len;j++)
            {
                if(arr[i]<arr[j])
                {
                    d=arr[i];
                    s=word[i];
                    arr[i]=arr[j];
                    word[i]=word[j];
                    arr[j]=d;
                    word[j]=s;
                }
            }
        }
        System.out.print("OUTPUT:: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(word[i]+" ");
        }
        System.out.println();
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s1=Sc.nextLine();
        int len=s1.length();
        char ch=s1.charAt(len-1);
        if((ch=='?')||(ch=='.')||(ch=='!'))
        {
            String st=s1.substring(0,len-1);
            System.out.println(st);
            StringTokenizer s=new StringTokenizer(st);
            int c=s.countTokens();
            Pot ob=new Pot(st,c);
            while(s.hasMoreTokens())
            {
                String w=s.nextToken();
                ob.potential(w);
            }
            ob.sort();
        }
        else
        System.out.println ("INVALID STRING");
    }
}