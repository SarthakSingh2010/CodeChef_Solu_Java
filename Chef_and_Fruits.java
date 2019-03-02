import java.util.*;
class Chef_and_Fruits
{
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            int a=sc.nextInt();
            int o=sc.nextInt();
            int g=sc.nextInt();
            int diff=(int)(Math.abs(a-o));
            if(diff<=g)
            System.out.println("0");
            else
            System.out.println(Math.abs(diff-g));
        }
    }
}
