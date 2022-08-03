import java.util.*;
public abstract class student
{
    String name[],dob[];
    int roll[];
    student(int i)
    {
        name=new String[i];
        dob=new String[i];
        roll=new int[i];
    }
    abstract void inputdata();
    abstract void printdata();
}