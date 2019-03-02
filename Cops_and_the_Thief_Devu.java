import java.util.*;
class Cops_and_the_Thief_Devu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            int M=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int pro=x*y;
            int arr[]=new int[M];
            int chk[]=new int[100];
            for(int j1=0;j1<100;j1++)
            {
                chk[j1]=0;
            }
            for(int j2=0;j2<M;j2++)
            {
                arr[j2]=sc.nextInt();
            }
            for(int j3=0;j3<M;j3++)
            {
                int k=arr[j3];
                int min=((k-pro)>0)?k-pro-1:0;
                int max=((k+pro)<100)?k+pro-1:99;
                for(int l=min;l<=max;l++)
                {
                    chk[l]=1;    
                }
            }
            for(int j=0;j<100;j++)
            {
                if(chk[j]==0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
            
