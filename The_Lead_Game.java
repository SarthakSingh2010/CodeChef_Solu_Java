import java.util.*;
 class The_Lead_Game
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("input");
         int r=sc.nextInt();
         int ar[]=new int[r];
         int br[]=new int[r];
         int lead[]=new int[r];
         int leader[]=new int[r];
         int s1=0,s2=0,diff=0;
         for(int i=0;i<r;i++)
         {
             ar[i]=sc.nextInt();
             br[i]=sc.nextInt();
         }
         for(int a=0;a<r;a++)
         {
             for(int b=0;b<=a;b++)
             {
                 s1=s1+ar[b];
                 s2=s2+br[b];
             }
             int max=(int)(Math.max(s1,s2));
             if(max==s1)
             leader[a]=1;
             else
             leader[a]=2;
             int min=(int)(Math.min(s1,s2));
             diff=max-min;
             lead[a]=diff;
             s1=0;s2=0;min=0;max=0;
         }
         int maxlead=0,pos=0;
         for(int y=0;y<r;y++)
         {
             if(lead[y]>maxlead)
             {
                 maxlead=lead[y];
                 pos=y;
             }
         }
         System.out.println(leader[pos]+"   "+maxlead);
        }
    }
            
