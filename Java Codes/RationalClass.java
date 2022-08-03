import java .util.*;
class RationalClass
{
    int numerator;
    int denominator;
    int nr,dr;
    int gcd=0;
    RationalClass(int n,int d)
    {
        numerator=n;
        denominator=d;
    }
    void simply()
    {
        int max=Math.max(numerator,denominator);
        for(int i=1;i<=max;i++)
        {
            if((denominator%i==0)&&(numerator%i==0))
            gcd=i;
        }
        nr=numerator/gcd;
        dr=denominator/gcd;
    }
    void gcd()
    {
        
    }
}