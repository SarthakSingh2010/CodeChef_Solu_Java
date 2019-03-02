import java.util.*;
class Add_two_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int m=0;m<t;m++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[m]=a+b;
        }
        for(int m=0;m<t;m++)
        {
            System.out.println(arr[m]);
        }
    }
}