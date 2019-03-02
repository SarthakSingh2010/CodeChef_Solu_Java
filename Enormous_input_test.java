import java.util.*;
class Enormous_input_test
{
    public static void main(String sarthak[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%k==0)
            c++;
        }
        System.out.println(c);
        sc.close();
    }
}
        