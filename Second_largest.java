import java.util.*;
class Second_largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=a,min=a;
            if(b>a&&b>c)
            max=b;
            if(c>a&&c>b)
            max=c;
            if(b<a&&b<c)
            min=b;
            if(c<a&&c<b)
            min=c;
            System.out.println(a+b+c-min-max);
        }
    }
}