import java.util.*;
class Find_remainder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
           System.out.println(sc.nextInt()%sc.nextInt()); 
        }
    }
}
