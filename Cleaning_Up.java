import java.util.*;
class Cleaning_Up
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int a=sc.nextInt();
        for(int y=0;y<a;y++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[m];
            int init[]=new int[n];
            for(int u=0;u<n;u++)
            init[u]=u+1;
            for(int u=0;u<m;u++)
            {
                arr[u]=sc.nextInt();
                init[arr[u]-1]=-1;
            }
            for(int i=0;i<n;i++)
            {
                if(init[i]==-1)
                {
                    for(int q=i;q<n-1;q++)
                    init[q]=init[q+1];
                    n--;i--;
                }
            }
            for(int i=0;i<n;i+=2)
            {
                System.out.print(init[i]+" ");
            }
            System.out.println();
            for(int i=1;i<n;i+=2)
            {
                System.out.print(init[i]+" ");
            }
            System.out.println();
        }
    }
}