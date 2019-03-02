import java.util.*;
class Reverse_the_number
{
    public static void main(String args[])
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r[]=new int[t];
        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int k=n,s=0;
            while(k!=0)
            {
                s=(s*10)+(k%10);
                k/=10;
            }
            r[m]=s;
        }
        for(int m=0;m<t;m++)
        System.out.println(r[m]);
    }
}
    