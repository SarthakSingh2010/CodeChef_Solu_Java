import java.util.*;
public class Paying_up
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            for(int y=0;y<n;y++)
            arr[y]=sc.nextInt();
            Arrays.sort(arr);
            int sum=0,y=n-1;
            while(sum!=m&&y!=0)
            {
                if(arr[y]<m)
                sum=sum+arr[y];
                y--;
            }
            if(sum==m)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}