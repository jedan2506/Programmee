import java.util.*;
class Parenthesis
{
    String st;
    Parenthesis(String s)
    {
        st=s;
    }

    void Check()
    {
        StringTokenizer str=new StringTokenizer(st);
        String st1="";
        int count1=0;
        while(str.hasMoreTokens())
        {
            String s=str.nextToken();
            int len=s.length();
            int count=0;
            int p=0;
            for(int i=0;i<len;i++)
            {
                if(s.charAt(i)=='(')
                {
                    count++;
                    p=i;
                }
            }
            if(count==1)
            {
                st1=st1+"";
            }
            else if(count<=0)
            {
                st1=st1+s+" ";
            }
            else
            {
                count1=1;
            }
        }
        if(count1==1)
            System.out.println("Sorry, an invalid string");
        else
            System.out.println(st1);
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String s=Sc.nextLine();
        s=s.toUpperCase();
        Parenthesis ob=new Parenthesis(s);
        ob.Check();
    }
}