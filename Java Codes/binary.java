import java.util.*;
class binary
{
    int n;
    String st;
    int sum=0;
    binary(int nn,String st1)
    {
        n=nn;
        st=st1;
    }
    int change(int m)
    {
        String s="";
        if(n==m)
        return sum;
        else
        {
            s=st.charAt(m)+s;
            sum=sum+(int)(Integer.valueOf(s)*Math.pow(2,m));
            return change(++m);
        }
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String s=Sc.next();
        int l=s.length();
        binary ob=new binary(l,s);
        int sum=ob.change(0);
        System.out.println("Binary to Decimal Number:: "+sum);
    }
}