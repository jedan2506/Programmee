import java.util.*;
class D3Point extends D2Point
{
    double z;
    D3Point()
    {
        super();
        z=0;
    }

    D3Point(double nx,double ny,double nz)
    {
        super(nx,ny);
        z=nz;
    }

    double distance3d(D3Point b)
    {
        double distan=Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2)+Math.pow(z-b.z,2));
        return distan;
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x=Sc.nextInt();
        int y=Sc.nextInt();
        System.out.println("Enter the z-coordinate");
        int z=Sc.nextInt();
        D3Point ob1=new D3Point();
        D3Point ob2=new D3Point(x,y,z);
        double result1=ob2.distance2d(ob1);
        double result2=ob2.distance3d(ob1);
        System.out.println("Distance in Plane:: "+result1);
        System.out.println("Distance in Space:: "+result2);
    }
}