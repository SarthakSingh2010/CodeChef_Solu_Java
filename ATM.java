import java.util.*;
class ATM
{
    public static void main(String sarthak[])
    {
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int x=sc.nextInt();
        double x2=(double)(x+0.50);
        double amt=sc.nextDouble();
        if((x%5==0)&&(amt>x2))
            res=amt-x2;
        else
            res=amt;
        System.out.println(res);
        sc.close();
    }
}
