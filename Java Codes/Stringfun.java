import java .util.*;
class Stringfun
{
    String str;

    void input()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the String");
        str=Sc.nextLine();
    }

    void words()
    {
        int l=str.length();
        int count1=1;
        int count2=0;
        int count3=0;
        for(int i=0;i<l;i++)
        {   char c=str.charAt(i);
            int val=(int)c;
            if(c==' ')
                count1++;
            if((c=='a')||(c=='e')||(c=='o')||(c=='i')||(c=='u')||(c=='A')||(c=='E')||(c=='O')||(c=='I')||(c=='U'))
                count2++;
            if((val>=65)&&(val<=90))
            count3++;
        }
        System.out.println("Number of Words: "+count1);
        System.out.println("Number of Vowels: "+count2);
        System.out.println("Number of Uppercase characters: "+count3);
        System.out.println();
    }
    
    void frequency()
    {
        int val=0;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
           char c=str.charAt(i);
           val=(int)c;
           if(c!=' ')
           System.out.println("Frequency of "+c+" is: "+val); 
        }
    }
    public static void main()
    {
        Stringfun ob=new Stringfun();
        ob.input();
        ob.words();
        ob.frequency();
    }
}