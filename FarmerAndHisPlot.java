import java.util.*;
class FarmerAndHisPlot
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("input");
    int t=sc.nextInt();
    int res[]=new int[t];
    for(int i=0;i<t;i++)
    {
        int m=sc.nextInt();
        int n=sc.nextInt();
        int h=1;
        for(int j=(int)(Math.min(m,n));j>=1;j--)
        {
            if((m%j==0) && (n%j==0))
            {
                h=j;
                break;
            }
        }
        res[i]=(m*n)/(h*h);
    }
    for(int i=0;i<t;i++)
        {
            System.out.println(res[i]);
        }
}
}