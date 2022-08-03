import java.util.*;
class stringop
{
    String st;
    stringop()
    {
        st="";
    }

    void readstring()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the String");
        st=Sc.nextLine();
    }

    char caseconvert(int num)
    {
        char l=st.charAt(num);
        if(Character.isUpperCase(l))
        {
            l=Character.toLowerCase(l);
        }
        else if(Character.isLowerCase(l))
        {
            l=Character.toUpperCase(l);
        }
        return l;
    }

    void circulardecode()
    {
        String st2="";
        int i=st.length();
        for(int j=0;j<i;j++)
        {
            char o=caseconvert(j);
            int l=0;
            char c=' ';
            if(o!=' ')
            {
                l=((int)o)+1;
                c=(char)l;
            }
            st2=st2+c;
        }
        System.out.println(st2);
    }

    public static void main()
    {
        String st1="";
        stringop ob=new stringop();
        ob.readstring();
        int i=ob.st.length();
        for(int j=0;j<i;j++)
        {
            char o=ob.caseconvert(j);
            st1=st1+o;
        }
        System.out.println(st1);
        ob.circulardecode();
    }
}