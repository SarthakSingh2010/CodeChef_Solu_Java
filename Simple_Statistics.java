import java.util.*;
class Simple_Statistics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            int c=n-(k*2);
            double avg;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int p=0;p<k;p++)
            {
                arr[p]=0;
                arr[n-1-p]=0;
            }
            for(int j=0;j<n;j++)
            {
                sum+=arr[j];
            }
            avg=(double)sum/c;
            System.out.println(avg);
        }
    }
}
