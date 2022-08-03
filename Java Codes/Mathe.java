import java.util.*;
class Mathe
{
    int n1;
    int n2;
    int mul=0;
    int div=0;
    Mathe(int nn1,int nn2)
    {
        n1=nn1;
        n2=nn2;
    }
    public void calculate()
    {
        div=n1/n2;
        mul=n1*n2;
    }
    public void display()
    {
        System.out.println("Division value:: "+div);
        System.out.println("Multiplication value:: "+mul);
    }
}