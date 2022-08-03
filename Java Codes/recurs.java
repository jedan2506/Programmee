import java .util.*;
class recurs
{
    public int rec(int num)
    {
        if(num==0)
            return 0;
        else
            return(num+rec(num-1));
    }

    public static void main()
    {
        int i,r,num;
        recurs ob=new recurs();
        for(i=0;i<5;i++)
        {
            r=ob.rec(i);
            System.out.println(i+"\t"+r);
        }
    }
}