import java.util.*;
class Cutting_Recipes
{
    public static void main(String args[])
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int [n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            if(n==1)
            System.out.println(arr[0]);
            else
            {
                int h=arr[0];
                for(int u=1;u<n;u++)
                {
                    h=hcf(h,arr[u]);
                }
                for(int j=0;j<n;j++)
                {
                    System.out.print((arr[j]/h)+" ");
                }   
            }   
            System.out.println();
        }
    }
    public static int hcf(int a,int b)
    {
        int h=1;
        for(int i=Math.min(a,b);i>=0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
                break;
            }
        }
        return h;
    }
}
