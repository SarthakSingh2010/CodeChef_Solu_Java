import java.util.*;
class First_and_Last_Digit
{
    public static void main(String args[])
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r[]=new int[t];
        for(int m=0;m<t;m++)
        {
            String s=sc.next();
            int a=Integer.parseInt(Character.toString(s.charAt(0)));
            int b=Integer.parseInt(Character.toString(s.charAt(s.length()-1)));
            r[m]=a+b;
        }
        for(int m=0;m<t;m++)
        System.out.println(r[m]);
    }
}
    