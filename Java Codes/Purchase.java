import java.util.*;
class Purchase extends Stock
{
    int pqty;
    int prate;
    Purchase (int p1,int p2,String i,int q,int r,int a)
    {
        super(i,q,r,a);
        pqty=p1;
        prate=p2;
    }

    void update()
    {
        qty=qty+pqty;
        if(prate!=rate)
            rate=prate;
        amt=qty*rate;
    }

    void display()
    {
        System.out.println("Name of the Item:: "+item);
        System.out.println("Quantity:: "+qty);
        System.out.println("Unit Price:: "+rate);
        System.out.println("Net value of the Stock:: "+amt);
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Name of the item");
        String n=Sc.nextLine();
        System.out.println("Enter the Quantity");
        int q=Sc.nextInt();
        System.out.println("Enter the Unit Price");
        int u=Sc.nextInt();
        System.out.println("Enter the Value of the stock");
        int v=Sc.nextInt();
        System.out.println("Enter the Purchased quantity");
        int q1=Sc.nextInt();
        System.out.println("Enter the Unit Price of the Purchased item");
        int u1=Sc.nextInt();
        Purchase ob=new Purchase(q1,u1,n,q,u,v);
        ob.update();
        ob.display();
    }
}