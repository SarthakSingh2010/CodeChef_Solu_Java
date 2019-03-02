import java.util.*;
class Mahasena
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }
        if(even>odd)
        System.out.println("READY FOR BATTLE");
        else
        System.out.println("NOT READY");
    }
}
