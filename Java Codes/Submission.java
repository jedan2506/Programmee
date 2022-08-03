import java.util.*;
class Submission
{
    int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int d,m,y;
    Submission(int dd,int mm,int yy)
    {
        d=dd;
        m=mm;
        y=yy;
    }

    void leap()
    {
        if (y%4==0)
            month[1]=month[1]+1;
    }

    void search()
    {
        int j=d-15;
        if(j<0)
        {
            if(m==1)
            {
                y--;
                m=13;
            }
            m--;
            d=month[m-1]+j;
        }
        else
            d=j;
        System.out.println("Date of Announcement:: "+d+"/"+m+"/"+y);
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Date of Submission");
        int date=Sc.nextInt();
        System.out.println("Enter the Month");
        int mon=Sc.nextInt();
        System.out.println("Enter the Year");
        int year=Sc.nextInt();
        Submission ob=new Submission(date,mon,year);
        ob.leap();
        int k=0;
        ob.search();
    }
}