import java.util.*;
class Chef_and_Dolls
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int len=sc.nextInt();
            int arr[]=new int [len];
            for(int j=0;j<len;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k=0;k<len-1;k=k+2)
            {
                if(k+1==len)
                {
                    System.out.println(arr[k]);
                    break;
                }
                else if(arr[k]!=arr[k+1])
                {
                    System.out.println(arr[k]);
                    break;
                }
            }
        }
    }
}