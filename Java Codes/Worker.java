import java.util.*;
class Worker
{
    String Name;
    double Basic;
    Worker(String st,double b)
    {
        Name=st;
        Basic=b;
    }
    void display()
    {
        System.out.println("Name of the Worker:: "+Name);
        System.out.println("The Basic Pay:: "+Basic);
    }
}