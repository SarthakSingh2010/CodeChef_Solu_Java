import java.util.Scanner;
class TheNextPallindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT");
        int t=sc.nextInt();
        int res[]=new int[t];
        for(int i=0;i<t;i++)
        {
            int p=sc.nextInt();
            res[i]=nextPallin(p);
        }
        for(int i=0;i<t;i++)
        System.out.println(res[i]);
    }
    public static int nextPallin(int p)
    {
        p++;
        while(pallin(p)!=true)
        p++;
        return p;
    }
    public static boolean pallin(int n)
    {
        String s=Integer.toString(n);
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}