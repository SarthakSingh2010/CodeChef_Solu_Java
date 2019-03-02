import java.util.*;
class holes_in_the_text
{
    public static void main(String sarthak[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        int c=0;
        String str[]=new String[t];
        for(int k=0;k<t;k++)
            str[k]=sc.next();
        for(int k=0;k<t;k++)
        {
            c=0;
            for(int y=0;y<str[k].length();y++)
                {
                    
                       if(str[k].charAt(y)=='A'||str[k].charAt(y)=='D'||str[k].charAt(y)=='O'||str[k].charAt(y)=='P'||str[k].charAt(y)=='Q'||str[k].charAt(y)=='R')
                       c++;
                       else
                       if(str[k].charAt(y)=='B')
                       c=c+2;
                    }  
                System.out.println(c);
            }
            sc.close();
        }
    }