import java.util.*;
class Primality_test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        Primality_test ob=new Primality_test();
        boolean res[]=new boolean[t];
        for(int r=0;r<t;r++)
            res[r]=ob.prime(sc.nextInt());
        for(int r=0;r<t;r++)
        {
            if(res[r]==true)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
    public boolean prime(int n)
    {
        if(n!=1)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}