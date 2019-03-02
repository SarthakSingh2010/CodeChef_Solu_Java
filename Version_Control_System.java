import java.util.*;
class Version_Control_System
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[m];
            int b[]=new int[k];
            for(int j=0;j<m;j++)
            a[j]=sc.nextInt();
            for(int j=0;j<k;j++)
            b[j]=sc.nextInt();
            int coc=countOfCommon(a,m,b,k);
            int col=countOfLeft(a,m,b,k,n);
            System.out.print(coc+" "+col);
            System.out.println();
        }
    }
    public static int countOfCommon(int a[],int m,int b[],int k)
    {
        int count=0;
        for(int i=0;i<m;i++)
        {
            int c=a[i];
            for(int j=0;j<k;j++)
            {
                if(c==b[j])
                count++;
            }
        }
        return count;
    }
    public static int countOfLeft(int a[],int m,int b[],int k,int n)
    {
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=-1;
        }
        for(int i=0;i<m;i++)
        {
            int v=a[i];
            arr[v-1]=0;
        }
        for(int i=0;i<k;i++)
        {
            int v=b[i];
            arr[v-1]=0;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==-1)
            count++;
        }
        return count;
    }
}
