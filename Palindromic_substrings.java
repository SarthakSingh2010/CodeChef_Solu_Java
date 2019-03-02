import java.util.*;
class Palindromic_substrings
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s1=sc.next();
            String s2=sc.next();
            System.out.println((result(s1,s2)==true)?"Yes":"No");
        }
    }
    public static boolean result(String s1,String s2)
    {
        for(int j=0;j<s1.length();j++)
        {
            for(int k=0;k<s2.length();k++)
            {
                if(s2.charAt(k)==s1.charAt(j))
                return true;
            }
        }
        return false;
    }
}
