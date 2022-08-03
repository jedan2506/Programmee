import java.util.*;
class Bank
{
    String name;
    long accno;
    double p;
    Bank(String s,long a,double p1)
    {
        name=s;
        accno=a;
        p=p1;
    }
    void display()
    {
        System.out.println("Name:: "+name);
        System.out.println("Account Number:: "+accno);
        System.out.println("Principal value:: "+p);
    }
}