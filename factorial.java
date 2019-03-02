import java.math.BigInteger;
import java.util.*;
class factorial
{
    public static void main(String sarthak[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int arr[]=new int[t];
        int c=0;
        for(int a=0;a<t;a++)
        {
          arr[a]=sc.nextInt();
        }
        for(int d=0;d<arr.length;d++)
        {
        BigInteger f=new BigInteger("1");
        for(int b=1;b<=arr[d];b++)
           { f=f.multiply(BigInteger.valueOf(b));
           }
           String s=f.toString();
           c=0;
           for(int q=s.length()-1;q>=0;q--)
           {
               if(s.charAt(q)!='0')
               break;
               c++;
            }
               System.out.println(c);
           
    }
    sc.close();
}
}