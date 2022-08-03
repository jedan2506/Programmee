import java .util.*;
import java .io.*;
class Complement
{
    int n;
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(isr);
    Complement(int nn)
    {
        n=nn;
    }
    String binary()
    {
        int num=n;
        int l=0;
        String st="";
        while(num>=1)
        {
            l=num%2;
            num=num/2;
            st=st+(Integer.toString(l));
        }
        return st;
    }
    String one(String s)
    {
        int len=s.length();
        String st="";
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='0')
            st=st+'1';
            else 
            st=st+'0';
        }
        return st;
    }
    String two(String s)
    {
        int len=s.length();
        String st="";
        if(s.charAt(len-1)=='0')
        {
            st=st+s.charAt(len-1);
            st=st.replace('0','1');
            st=s.substring(0,len-1)+st;
        }
        else if(s.charAt(len-1)=='1')
        {
            int i=1;
            String s1="";
            while(s.charAt(len-i)=='1')
            {
                s1=s1+'0';
                st=s.substring(0,len-i)+s1;
                i++;
            }
            if(s.charAt(len-i)=='0')
            st=s.substring(0,len-i)+'1'+s1;
        }
        return st;
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
        Complement ob=new Complement(n);
        String s=ob.binary();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String st=sb.toString();
        System.out.println(st);
        String s1=ob.one(st);
        System.out.println("1's Complement:: "+s1);
        String s2=ob.two(s1);
        System.out.println("2's Complement:: "+s2);
    }
}