import java.util.*;
class Iscscores
{
    int number[][];int n=0;int sum=0;
    Iscscores()
    {
        Scanner Sc=new Scanner(System.in);
        number=new int[6][2];
        System.out.println("Enter the Code and Marks in the subject");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<6;j++)
            {
                number[j][i]=Sc.nextInt();
            }
        }
        for(int k=0;k<6;k++)
        {
            for(int l=0;l<2;l++)
            {
                System.out.print(number[k][l]+" ");
            }
            System.out.println();
        }
    }

    int point()
    {   int check=0;
        if(number[n][1]>=90)
            check=1;
        else if((number[n][1]>=80)&&(number[n][1]<=89))
            check=2;
        else if((number[n][1]>=70)&&(number[n][1]<=79))
            check=3;
        else if((number[n][1]>=60)&&(number[n][1]<=69))
            check=4;
        else if((number[n][1]>=50)&&(number[n][1]<=59))
            check=5;
        else if((number[n][1]>=40)&&(number[n][1]<=49))
            check=6;
        sum=sum+check;
        n=n+1;
        return check;
    }

    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        Iscscores ob=new Iscscores();
        for(int o=0;o<6;o++)
        {
            int p=ob.point();
            System.out.println("Got "+p+" points in subject "+ob.number[o][0]);
        }
    }
}