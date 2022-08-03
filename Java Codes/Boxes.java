import java .util. *;
class Boxes
{
    int box;
    int count;
    int sum=0;
    Boxes(int n)
    {
        box=n;
        count=0;
    }

    public void find()
    {
        if(box>48)
        {
            while(box>48)
            {
                box=box-48;
                count++;
            }
            while(box>0)
            {
                sum=0;
                if(box>24)
                {
                    while(box>24)
                    {
                        box=box-24;
                        count++;
                    }
                }
                else if(box>12)
                {
                    while(box>12)
                    {
                        box=box-12;
                        count++;
                    }
                }
                else if(box>6)
                {
                    while(box>6)
                    {
                        box=box-6;
                        count++;
                    }
                }
                else
                {
                    count++;
                    box=0;
                }
            }
        }
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Number of Boxes");
        int n=Sc.nextInt();
        Boxes ob=new Boxes(n);
        ob.find();
        System.out.println("Total Cartons:: "+ob.count);
    }
}