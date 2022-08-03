import java.io.*;
import java.util.*;
class prime_pal
{
    int num;
    int check=0;
    prime_pal(int n)
    {
        num=n;
    }
    int prime(int i)
    {
        if(i==(num+1))
        return check;
        else
        {
            if(num%i==0)
            check++;
            return prime(++i);
        }
    }
    void palindrome()
    {
        if(check==2)
        {
            String st=Integer.toString(num);
            StringBuffer sr=new StringBuffer(st);
            sr.reverse();
            String s=sr.toString();
            if(s.equals(st))
            System.out.println("Its is a Prime Palindrome");
            else
            System.out.println("Its is not Prime Palindrome");
        }
    }
    public static void main()
    {
        prime_pal ob=new prime_pal(101);
        int ch=ob.prime(1);
        ob.palindrome();
    }
}

    