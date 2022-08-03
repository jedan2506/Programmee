import java.util.*;
class Difference
{
    int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int d1,m1,y1,d2,m2,y2;
    Difference(int dd1,int mm1,int yy1,int dd2,int mm2,int yy2)
    {
        d1=dd1;
        m1=mm1;
        y1=yy1;
        d2=dd2;
        m2=mm2;
        y2=yy2;
    }

    void search()
    {
        System.out.println("First Date:: "+d1+"/"+m1+"/"+y1);
        System.out.println("Second Date:: "+d2+"/"+m2+"/"+y2);
        System.out.println();
        if(y1!=y2)
        {
            int j=m2-1;
            int sum=0;
            for(int i=0;i<j;i++)
            {
                sum=sum+month[i];
            }
            sum=sum+d2;
            System.out.println(sum);
            for(int i=m1;i<12;i++)
            {
                sum=sum+month[i];
            }
            sum=sum+(month[m1-1]-d1);
            System.out.println ("Total number of Days:: "+(sum-1));
        }
        else
        {
            int sum=0;
            sum=sum+(month[m1]-d1);
            for(int i=m1;i<m2;i++)
            {
                sum=sum+month[i];
            }
            sum=sum+d2;
            System.out.println("Total number of Days:: "+(sum-1));
        }
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Date");
        int date1=Sc.nextInt();
        System.out.println("Enter the Month");
        int mon1=Sc.nextInt();
        System.out.println("Enter the Year");
        int year1=Sc.nextInt();
        System.out.println("Enter the Date");
        int date2=Sc.nextInt();
        System.out.println("Enter the Month");
        int mon2=Sc.nextInt();
        System.out.println("Enter the Year");
        int year2=Sc.nextInt();
        Difference ob=new Difference(date1,mon1,year1,date2,mon2,year2);
        ob.search();
    }
}