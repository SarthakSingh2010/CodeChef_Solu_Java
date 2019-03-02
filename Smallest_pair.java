import java.util.*;
class Smallest_pair
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int res[]=new int[t];
        for(int m=0;m<t;m++)
        {
            int r=sc.nextInt();
            int arr[]=new int[r];
            for(int m2=0;m2<r;m2++)
            arr[m2]=sc.nextInt();
            Arrays.sort(arr);
            res[m]=arr[0]+arr[1];
        }
        for(int m3=0;m3<t;m3++)
        System.out.println(res[m3]);
    }
}