import java.util.*;
class connec
{
    double div;
    double mul;
    int i1,i2;
    connec(int i3,int i4)
    {
        i1=i3;
        i2=i4;
        div=0;
        mul=0;
    }
    public void cal()
    {
        div=i1/i2;
        mul=i1*i2;
    }
}