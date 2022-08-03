import java.util.*;
class Account extends Bank
{
    double amt;
    Account(String n,long l,double d)
    {
        super(n,l,d);
    }

    void deposit()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the amount");
        amt=Sc.nextDouble();
        p=p+amt;
    }

    void withdraw()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the amount");
        amt=Sc.nextDouble();
        if(p>amt)
        {
            if(p-amt<500)
            {
                p=p-(500-p)/10;
                System.out.println("A penalty has been imposed");
            }
            p=p-amt;
        }
        else
            System.out.println("INSUFFICIENT BALANCE");

    }
    void display()
    {
        super.display();
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the name of holder");
        String s=Sc.nextLine();
        System.out.println("Enter the account number");
        long l=Sc.nextLong();
        System.out.println("Enter the Principal value");
        double d=Sc.nextDouble();
        Account ob=new Account(s,l,d);
        System.out.println("Press 1 for Deposit");
        System.out.println("Press 2 for Withdraw");
        int i=Sc.nextInt();
        switch(i)
        {
            case 1:ob.deposit();
            break;
            case 2:ob.withdraw();
            break;
            default:System.out.println("Pagal dekh ke button daba");
        }
        ob.display();
    }
}