import java.util.*;
class PakagingCupcakes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. test cases");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            System.out.println((n/2)+1);
        }
    }
}
        