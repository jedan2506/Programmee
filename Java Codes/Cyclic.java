import java .util.*;
class Cyclic
{
    int n;
    Cyclic(int nn)
    {
        n=nn;
    }

    void test()
    {
        String s=Integer.toString(n);
        int len=s.length();
        char ch[]=new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i]=s.charAt(i);
        }
        int num=0;
        int check1=0;
        int check2=0;
        for(int k=1;k<=len;k++)
        {
            num=n*k;
            String st=Integer.toString(num);
            check1=0;
            for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                {
                    if(st.charAt(i)==ch[j])
                    {
                        check1++;
                        break;
                    }
                }
            }
            if(check1==len)
                check2++;
        }
        if(check2==len)
            System.out.println("Number "+n+" is cyclic");
        else
            System.out.println("Number "+n+" is not cyclic");
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
        Cyclic ob=new Cyclic(n);
        ob.test();
    }
}