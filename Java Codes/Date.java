import java.util.*;
class Date
{   int n;
    String month[]={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
    Date(int nn)
    {
        n=nn;
    }

    void Print()
    {  int ch[]=new int[3];String st="";
        String initial[]={"st","nd","rd","th"};
        int ch1=0;
        int ch2=0;
        for(int i=2;i>=0;i--)
        {
            ch[i]=n%100;
            n=n/100;
        }
        if((ch[1]>0)&&(ch[1]<=12))
        {
            for(int j=0;j<12;j++)
            {   
                if(j%2==0)
                {
                    if(ch[0]>31)
                        ch1=1;
                }
                else if(j%2==1)
                {
                    if(ch[0]>30)
                        ch2=1;
                    if(j==1)
                    {
                        if(ch[0]>28)
                        ch2=1;
                    }
                }
            }
            if((ch1==0)&&(ch2==0))
            { int o=ch[0]%10;
                st=st+Integer.toString(ch[0]);
                if(o==1)
                    st=st+initial[0]+" ";
                else if(o==2)
                    st=st+initial[1]+" ";
                else if(o==3)
                    st=st+initial[2]+" ";
                else
                    st=st+initial[3]+" ";
                for(int u=0;u<12;u++)
                {
                    if(u==(ch[1]-1))
                        st=st+month[u]+", ";

                }
                st=st+Integer.toString(ch[2]);
            }
            else
                System.out.println("INVALID DATE");
        }
        else
            System.out.println("INVALID DATE");
        System.out.println(st);
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=Sc.nextInt();
        String s=Integer.toString(num);
        int len=s.length();
        if(len==6)
        {
            Date ob=new Date(num);
            ob.Print();
        }
        else
            System.out.println("INVALID DATE");
    }
}
