import java.util.*;
public class Easy_Queries
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("INPUT");
       int N=sc.nextInt();
       int Q=sc.nextInt();
       int A[]=new int[N];
       for(int i=0;i<N;i++)
       A[i]=sc.nextInt();
       int S2[]=new int[A.length];
       int count=0;
       for(int i=0;i<A.length;i++)
       {
            int flag=0;
            for(int j=0;j<=count;j++)
            {
                if(A[i]==S2[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            S2[count++]=A[i];
       }
       int S[]=new int[count];
       for(int i=0;i<count;i++)
       S[i]=S2[i];
       Arrays.sort(S);
       int arr[][]=new int[Q][5];
       for(int i=0;i<Q;i++)
       {
           for(int j=0;j<5;j++)
           arr[i][j]=sc.nextInt();
       }
       for(int i=0;i<Q;i++)
       {
           int L=(arr[i][0]*Math.max(i,0)+arr[i][1])%N;
           int R=(arr[i][2]*Math.max(i,0)+arr[i][3])%N;
           if(L>R)
           {
               int t=L;
               L=R;
               R=t;
           }
           int cout=1;
           for(int y=L;y<=R;y++)
           cout++;
           if(cout<=arr[i][4])
           System.out.println(S[arr[i][4]-1]);
           else
           System.out.println("-1");
       }
    }
}
