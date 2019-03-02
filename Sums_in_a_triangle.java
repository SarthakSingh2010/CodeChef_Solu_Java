import java.util.*;
class Sums_in_a_triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cases");
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            System.out.println("enter height");
            int h=sc.nextInt();
            int test[][]=new int [h][h];
            int max=0,sum=0;
            for(int q=0;q<h;q++)
            {
                for(int w=0;w<=q;w++)
                {
                    System.out.println("enter value");
                    test[q][w]=sc.nextInt();
                }
            }
            for(int q=0;q<(h-1);q++)
            {
                sum=0;
                for(int w=0;w<=q;w++)
                {
                    sum=sum+test[q][w]+test[q+1][w]+test[q+1][w+1];
                if(sum>max)
                {
                    max=sum;
                    sum=0;
                }
                else
                sum=0;
            }
            }
            arr[i]=max;
        }
        for(int p=0;p<t;p++)
        System.out.println(arr[p]);
        sc.close();
    }
}
