import java.util.*;
import java.io.*;
class Evil
{
    int n;
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(isr);
    Evil (int nn)
    {
        n=nn;
    }

    String binary()
    {
        String s="";
        int n1=n;
        while(n1>0)
        {
            if(n1%2==1)
                s=s+Integer.toString(n1%2);
            else
                s=s+Integer.toString(n1%2);
            n1=n1/2;
        }
        return s;
    }

    String reverse(String st)
    {
        int n=st.length();
        String s="";
        for(int i=n-1;i>=0;i--)
        {
            s=s+st.charAt(i);
        }
        return s;
    }

    int count(String st)
    {
        int n=st.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(st.charAt(i)=='1')
                c++;
        }
        return c;
    }

    public static void main() throws IOException
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Number");
        int num=Sc.nextInt();
        if((num>2)&&(num<100))
        {
            Evil ob=new Evil(num);
            String s=ob.binary();
            s=ob.reverse(s);
            System.out.println(s);
            int i=ob.count(s);
            if(i%2==0)
                System.out.println(num+" is an Evil Number");
            else
                System.out.println(num+" is not an Evil Number");
        }
        else
        System.out.println("It is out of range");
    }
}
