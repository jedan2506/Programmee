import java.util.*;
class recur
{
    String s1="";
    String st;
    recur(String s)
    {
        st=s;
    }
    void check(int i)
    {
        if(i==-1)
        st=s1;
        else
        {
            s1=s1+st.charAt(i);
            check(--i);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        String h=Sc.next();
        int l=h.length()-1;
        recur ob=new recur(h);
        ob.check(l);
        System.out.println(ob.st);
    }
}