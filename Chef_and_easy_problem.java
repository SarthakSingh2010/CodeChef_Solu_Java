import java.util.*;
class Chef_and_easy_problem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            long sum=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int u=0;u<n;u++)
            a[u]=sc.nextInt();
            Arrays.sort(a);
            for(int y=n-1;y>=0;y-=2)
            sum+=a[y];
            System.out.println(sum);
        }
    }
}
