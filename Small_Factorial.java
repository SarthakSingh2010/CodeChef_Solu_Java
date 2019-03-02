import java.util.*;
class Small_Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int f=1;
            for(int i=1;i<=n;i++)
            f*=i;
            System.out.println(f);
        }
    }
}