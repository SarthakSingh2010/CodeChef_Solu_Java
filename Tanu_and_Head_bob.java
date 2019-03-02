import java.util.*;
class Tanu_and_Head_bob
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int t1=sc.nextInt();
            String s=sc.next();
            int f=0;
            for(int m1=0;m1<t1;m1++)
            {
                if(s.charAt(m1)=='Y')
                {
                    f=1;
                    System.out.println("NOT INDIAN");
                    break;
                }
                if(s.charAt(m1)=='I')    
                {
                    f=1;
                    System.out.println("INDIAN");
                    break;
                }
            }
            if(f==0)
            System.out.println("NOT SURE");
        }
    }
}