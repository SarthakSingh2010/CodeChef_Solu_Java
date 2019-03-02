import java.util.*;
class Alternating_subarray_prefix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int y=1;y<=t;y++)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
            for(int i=0;i<n;i++)
            {
                long c=1;
                for(int j=i;j<n-1;j++)
                {
                    if(arr[j]*arr[j+1]<0)
                    c++;
                    else
                    break;
                }
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
} 