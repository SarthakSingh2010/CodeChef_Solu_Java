import java.util.*;
class Smallest_no_of_notes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=1;m<=t;m++)
        {
            int n=sc.nextInt();
            int n100=n/100;
            n%=100;
            int n50=n/50;
            n%=50;
            int n10=n/10;
            n%=10;
            int n5=n/5;
            n%=5;
            int n2=n/2;
            n%=2;
            int n1=n/1;
            n%=1;
            System.out.println(n100+n50+n10+n5+n2+n1);
        }
    }
}