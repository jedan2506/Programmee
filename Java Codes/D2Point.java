import java .util.*;
class D2Point
{
    double x,y;
    D2Point()
    {
        x=0;
        y=0;
    }
    D2Point(double nx,double ny)
    {
        x=nx;
        y=ny;
    }
    double distance2d(D2Point b)
    {
        double dis=Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2));
        return dis;
    }
}