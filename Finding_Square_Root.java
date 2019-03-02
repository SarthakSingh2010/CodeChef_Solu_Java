import java.util.*;
class Finding_Square_Root
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        arr[i]=(int)(Math.sqrt(sc.nextInt()));
        for(int i=0;i<t;i++)
        System.out.println(arr[i]);
    }
}
