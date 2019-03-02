import java.util.*;
class CeilAndReceipt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT");
        int t=sc.nextInt();
        int arr[]={2048,1024,512,256,128,64,32,16,8,4,2,1};
        for(int i=0;i<t;i++)
        {
            int m=sc.nextInt();
            int c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<=m)
                {
                    c=c+(m/arr[j]);
                    m=m%arr[j];
                    j--;
                }
            }
            System.out.println(c);
        }
    }
}
