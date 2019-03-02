import java.math.BigInteger;
import java.util.*;
class small_factorials
{
    public static void main(String sarthak[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int a=0;a<t;a++)
        {
          arr[a]=sc.nextInt();
        }
        for(int d=0;d<arr.length;d++)
        {
        BigInteger f=new BigInteger("1");
        for(int b=1;b<=arr[d];b++)
            f=f.multiply(BigInteger.valueOf(b));
        System.out.println(f);
        }
        sc.close();
    }
}