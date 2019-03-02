import java.util.*;
class Total_expenses
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int y=1;y<=t;y++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            double val=(double)(a*b);
            if(a>1000)
            val=val-(0.1*val);
            System.out.printf("%.6f\n",val);
        }
    }
}