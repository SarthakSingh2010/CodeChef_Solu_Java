
/**thatMethod();
long time2 = System.nanoTime();

System.out.println("Time taken " + timeTaken + " ns");*/


import java.util.*;
class Decreasing_String
{
   public static void main(String args[])
   {
       long time1 = System.nanoTime();
       Scanner sc=new Scanner(System.in);
       System.out.println("Input");
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       { 
           int n=sc.nextInt();
           if(n<=25)
           {
               char ch=(char)('a'+(n));
               for(int j=0;j<=n;j++)
               {
                   System.out.print(ch);
                   ch--;
               }
               System.out.println();
           }
           else
           {
               int y=n%25;
               char ch=(char)('a'+(y));
               for(int j=0;j<=y;j++)
               {
                   System.out.print(ch);
                   ch--;
               }
               int chk=n/25;
               while(chk!=0)
               {
                   System.out.print("zyxwvutsrqponmlkjihgfedcba");
                   chk--;
               }
               System.out.println();
           }
       }
       long time2 = System.nanoTime();
       long timeTaken = time2 - time1;  
       System.out.println("Time taken " + timeTaken + " ns");
   }
}