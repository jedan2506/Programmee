import java.util.*;
class Circular 
{
    int n;
    int check=0;
    String s;
    Circular(int nn)
    {
        n=nn;
        s=Integer.toString(n);
    }

    String word()
    {
        int n1=n;
        int len=s.length();
        s=s.substring(1,len)+s.charAt(0);
        return s;
    }

    void prime(String s)
    {
        int num=Integer.parseInt(s);
        int ch=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                ch++;
        }
        if(ch==2)
            check++;
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        String s=Integer.toString(n);
        int len=s.length();
        Circular ob=new Circular(n);
        for(int i=0;i<len;i++)
        {
            String st=ob.word();
            ob.prime(st);
        }
        if(ob.check==len)
        System.out.println(n+" is a Circular Prime");
        else
        System.out.println(n+" is not a Circular Prime");
    }
}