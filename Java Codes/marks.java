import java.util.*;
class marks extends student
{
    float p[],c[],m[],cts[],e[];
    float tot,per;
    char gd[];
    int i;
    marks(int j)
    {
        super(j);
        p=new float[j];
        c=new float[j];
        m=new float[j];
        cts=new float[j];
        e=new float[j];
        tot=0;
        per=0;
        gd=new char[j];
        i=j;
    }

    void readdata()
    {
        Scanner Sc=new Scanner (System.in);
        for(int j=0;j<i;j++)
        {
            System.out.println("Enter the Marks in Physics");
            p[j]=Sc.nextInt();
            System.out.println("Enter the Marks in Chemistry");
            c[j]=Sc.nextInt();
            System.out.println("Enter the Marks in Maths");
            m[j]=Sc.nextInt();
            System.out.println("Enter the Marks in Computer Science");
            cts[j]=Sc.nextInt();
            System.out.println("Enter the Marks in English");
            e[j]=Sc.nextInt();
        }
    }

    void compute()
    {
        for(int j=0;j<i;j++)
        {
            tot=p[j]+c[j]+m[j]+cts[j]+e[j];
            per=tot/2;
            if(per>=90)
                gd[j]='A';
            else if((per>=60)&&(per<90))
                gd[j]='B';
            else if((per>=40)&&(per<60))
                gd[j]='C';
            else
                gd[j]='D';
        }
    }

    void inputdata()
    {
        Scanner Sc=new Scanner(System.in);
        for(int j=0;j<i;j++)
        {
            System.out.println("Enter the name of the Student");
            name[j]=Sc.nextLine();
            System.out.println("Enter the DOB");
            dob[j]=Sc.nextLine();
            System.out.println("Enter the Roll Number");
            roll[j]=Sc.nextInt();
        }
    }

    void printdata()
    {
        System.out.println("Name"+"\t\t"+"DOB"+"\t"+"Roll No."+"\t"+"Physics"+"\t\t"+"Chemistry"+"\t\t"+"Maths"+"\t\t"+"Computer"+"\t\t"+"English"+"\t\t"+"Grade");
        for(int j=0;j<i;j++)
        {
            System.out.print(name[j]+"\t\t");
            System.out.print(dob[j]+"\t\t");
            System.out.print(roll[j]+"\t\t");
            showdata(j);
            System.out.println();
        }

    }

    void showdata(int j)
    {
        //for(int j=0;j<i;j++)
        System.out.print(p[j]+"\t\t");
        System.out.print(c[j]+"\t\t");
        System.out.print(m[j]+"\t\t");
        System.out.print(cts[j]+"\t\t");
        System.out.print(e[j]+"\t\t");
        System.out.print(gd[j]+"\t\t");
    }

    public static void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Number of inputs");
        int n=Sc.nextInt();
        marks ob=new marks(n);
        ob.readdata();
        ob.compute();
        ob.inputdata();
        ob.printdata();
    }
}