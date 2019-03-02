import java.util.*;
class Sum_of_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int a=sc.nextInt();
            int k=a,s=0;
            while(k!=0)
            {
                s=s+(k%10);
                k/=10;
            }
            System.out.println(s);
        }
    }
}