import java.util.*;
class turbo_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++)
        {
            System.out.println("value");
            arr[a]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int b=0;b<n;b++)
            System.out.println(arr[b]);
            sc.close();
    }
}
        