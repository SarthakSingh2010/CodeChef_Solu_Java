import java.util.*;
class MinimumMaximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT");
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            int len=sc.nextInt();
            long arr[]=new long[len];
            for(int i=0;i<len;i++)
            arr[i]=sc.nextLong();
            Arrays.sort(arr);
            System.out.println(arr[0]*(len-1));
        }
    }
}