import java.util.*;
class Potential
{
    String s;
    int l;
    int arr[];
    String arr1[];
    Potential(String st,int len)
    {
        s=st;
        l=len;
        arr=new int[l];
        arr1=new String[l];
    }

    int potent(String st)
    {
        int len=st.length();
        int pot=0;
        for(int i=0;i<len;i++)
        {
            pot=(int)st.charAt(i)+pot;
        }
        return pot;
    }

    void arrange()
    {
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l-1;j++)
            {
                int k=0;
                String s2="";
                if(arr[i]>arr[j])
                {
                    k=arr[i];
                    s2=arr1[i];
                    arr[i]=arr[j];
                    arr1[i]=arr1[j];
                    arr[j]=k;
                    arr1[j]=s2;
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<l;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println(s.charAt(s.length()-1));
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=Sc.nextLine();
        String s5=s.substring(0,s.length()-1);
        StringTokenizer st=new StringTokenizer(s5);
        int len=st.countTokens();
        Potential ob=new Potential(s,len);
        int i1=0;
        if(((s.charAt(s.length()-1))=='.')||((s.charAt(s.length()-1))=='!')||((s.charAt(s.length()-1))=='?'))
        {
            while(st.hasMoreTokens())
            {
                String s1=st.nextToken();
                int l=s1.length();
                int count=0;
                for(int i=0;i<l;i++)
                {
                    if(Character.isUpperCase(s.charAt(i)))
                        count++;
                }
                if(count==l)
                {
                    int pot=ob.potent(s1);
                    ob.arr[i1]=pot;
                    ob.arr1[i1]=s1;
                    i1++;
                }
            }
            ob.display();
            ob.arrange();
            ob.display();
        }
        else
        System.out.println("INVALID INPUT");
    }
}