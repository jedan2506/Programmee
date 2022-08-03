import java.util.*;
class oct
{
    String st="";
    String change(int n)
    {
       if(n<=7)
       return (Integer.toString(n)+st);
       else
       {
           st=Integer.toString(n%8)+st;
           return change(n/8);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=Sc.nextInt();
        oct ob=new oct();
        String s=ob.change(n1);
        System.out.println(s);
    }
}