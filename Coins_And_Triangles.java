import java.util.*;
class Coins_And_Triangles
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            long c=1;
            long n=sc.nextLong();
            while(n>=c)
            {
                n=n-c;
                c++;
            }
            System.out.println(c-1);
        }
    }
}