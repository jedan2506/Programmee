import java.util.*;
class Mystring
{
    int len;String str[];String st;
    Mystring(int l,String s)
    {
        len=l;
        str=new String[len];
        st=s;
    }
    
    void readstring()
    {
        StringTokenizer s=new StringTokenizer(st);
        int i=0;
        while(s.hasMoreTokens())
        {
            str[i]=s.nextToken();
            i++;
        }
        for(int j=0;j<len;j++)
        {
            System.out.println(str[j]);
        }
    }
    void word()
    {
        int l1=str[0].length();
        int w=0;
        int l2=0;
        for(int i=1;i<len;i++)
        {
           l2=str[i].length();
           if(l2>l1)
           {
               l1=l2;
               w=i;
            }
        }
        System.out.println("The Longest word is: "+str[w]);
    }
    
    int code(int index)
    {
       char c=st.charAt(index); 
       int i=(int)c;
       return(i);
    }
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String s=Sc.nextLine();
        StringTokenizer s1=new StringTokenizer(s);
        int l1=s1.countTokens();
        System.out.println(l1);
        System.out.println("Enter the index number");
        int i1=Sc.nextInt();
        Mystring ob=new Mystring(l1,s);
        ob.readstring();
        int i2=ob.code(i1);
        System.out.println("The ASCII code is: "+i2);
        ob.word();
    }
}