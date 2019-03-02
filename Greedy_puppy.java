import java.util.*;
class Greedy_puppy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int y=1;y<=t;y++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int max=0;
            for(int i=1;i<=b;i++)
            {
                if((a%i)>max)
                max=a%i;
            }
            System.out.println(max);
        }
    }
} 