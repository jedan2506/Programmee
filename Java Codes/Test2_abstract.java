import java.util.*;
public abstract class Test2_abstract
{
    String name[];
    Test2_abstract()
    {
        name=new String[2];
    }
    public void in()
    {
        Scanner Sc=new Scanner (System.in);
        for(int i=0;i<2;i++)
        {
            name[i]=Sc.next();
        }
    }
    public abstract void out();
}