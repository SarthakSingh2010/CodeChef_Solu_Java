 import java.util.*;
 class prime_pallindrome
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter");
         int n=sc.nextInt();
         int c=0;
         for(int a=n;a<=1000000;a++)
         {
             c=0;
             for(int k=1;k<=a;k++)
             {
                 if(a%k==0)
                 c++;
             }
             if(c==2)
             {
                 String s=Integer.toString(a);
                 String S="";
                 for(int l=s.length()-1;l>=0;l--)
                 {
                     S=S+s.charAt(l);
                 }
                 if(S.compareTo(s)==0)
                 {
                     System.out.println(a);
                     break;
                 }
             }
         }
        }
    }
            
        
    