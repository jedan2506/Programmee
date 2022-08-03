import java.util.*;
class swap
{
    int a,b;
    void swa(swap ob)
    {
        int c=ob.a;
        ob.a=ob.b;
        ob.b=c;
        System.out.println(ob.a);
        System.out.println(ob.b);
    }
    void main()
    {
        swap ob=new swap();
        ob.a=2;
        ob.b=3;
        System.out.println(ob.a);
        System.out.println(ob.b);
        swa(ob);
        System.out.println(ob.a);
        System.out.println(ob.b);
    }
}