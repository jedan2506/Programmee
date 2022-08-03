import java .util.*;
class Test3
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=Sc.nextLine();
        System.out.println("String:: "+s);
        StringTokenizer st=new StringTokenizer(s,"?,!,.");
        System.out.println();
        while (st.hasMoreTokens())
        {
            String s1=st.nextToken();
            System.out.println(s1);
        }
    }
}