import java.util.*;
class PrimeGenarator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of cases");
        int n=sc.nextInt();
        int arr[]=new int[n*2];
        int c=0;
        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            int u=sc.nextInt();
            arr[c]=l;
            arr[++c]=u;
            c++;
        }
        for(int i=0;i<arr.length;i=i+2)
        {
            for(int j=arr[i];j<=arr[i+1];j++)
            {
                if(prime(j)==true)
                System.out.println(j);
            }
            System.out.println();
        }
    }
    public static boolean prime(int k)
    {
        if(k<2)
        return false;
        for(int i=2;i*i<=k;i++)
        if(k%i==0)
        return false;
        return true;
    }
}
