import java.util.*;
class Lucky_four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            String s=sc.next();
            int c=0;
            for(int y=0;y<s.length();y++)
            {
                if(s.charAt(y)=='4')
                c++;
            }
            System.out.println(c);
        }
    }
}