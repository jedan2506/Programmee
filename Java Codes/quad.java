import java .util.*;
class quad
{
    float a,b,c;
    float x1,x2;
    quad(float aa,float bb,float cc)
    {
        a=aa;
        b=bb;
        c=cc;
    }
    float discriminant()
    {
        float D=(b*b)-(4*a*c);
        return D;
    }
    void root_equal()
    {
        x1=-(b/2*a);
        x2=x1;
        System.out.println("x1= "+x1+" & "+"x2= "+x2);
    }
    void image()
    {
        System.out.println("Sorry the roots are imgainery");
    }
    void root_real()
    {
        float d=(b*b)-(4*a*c);
        x1=(-b+(float)Math.sqrt(d))/(2*a);
        x2=(-b-(float)Math.sqrt(d))/(2*a);
        System.out.println("x1= "+x1+" & "+"x2= "+x2);
    }
    void root()
    {
        float d=(b*b)-(4*a*c);
        if(d>0)
        root_real();
        else if(d==0)
        root_equal();
        else 
        image();
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the values");
        float a1=Sc.nextFloat();
        float b1=Sc.nextFloat();
        float c1=Sc.nextFloat();
        quad ob=new quad(a1,b1,c1);
        float q=ob.discriminant();
        ob.root();
    }
}