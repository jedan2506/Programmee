import java.util.*;
class Test4
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char c=Sc.next().charAt(0);
        int n=(int)c;
        String s=Integer.toString(n);
        System.out.println(n);
        System.out.println(s);
        System.out.println("Enter a string");
        String st=Sc.next();
        int p=Integer.valueOf(st);
        System.out.println(p+1);
    }
}