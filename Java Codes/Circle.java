import java.util.*;
class Circle extends Plane
{
    int x2,y2;
    double radius,area;
    Circle(int xn,int yn, int xn1,int yn1)
    {
        super(xn1,yn1);
        x2=xn;
        y2=yn;
    }
    void findRadius()
    {
        radius=Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)))/2;
    }
    void findArea()
    {
        area=3.14*Math.pow(radius,2);
    }
    void Show()
    {
        super.Show();
        System.out.println("2nd x-coordinates:: "+x2);
        System.out.println("2nd y-coordinates:: "+y2);
        System.out.format("Radius:: %.2f",radius);
        System.out.println();
        System.out.format("Area:: %.2f",area);
    }
    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the coordinates of P1");
        int x1=Sc.nextInt();
        int y1=Sc.nextInt();
        System.out.println("Enter the coordinates of P2");
        int x2=Sc.nextInt();
        int y2=Sc.nextInt();
        Circle ob=new Circle(x2,y2,x1,y1);
        ob.findRadius();
        ob.findArea();
        ob.Show();
    }
}