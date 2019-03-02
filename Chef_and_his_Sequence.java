import java.util.*;
class Chef_and_his_Sequence
{
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++)
            arr[i]=sc.nextInt();
            int b=sc.nextInt();
            int brr[]=new int[b];
            for(int i=0;i<b;i++)
            brr[i]=sc.nextInt();
            int pos=-1;
            for(int i=0;i<a;i++)
            {
                if(arr[i]==brr[0])
                pos=i;
            }
            boolean bool=true;
            for(int j=0;j<b;j++)
            {
                if(brr[j]!=arr[pos])
                bool=false;
                if(pos<a-1)
                pos++;
            }
            if(bool==true)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}