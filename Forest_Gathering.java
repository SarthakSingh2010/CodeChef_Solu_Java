import java.io.*;
import java.util.*;
class Forest_Gathering
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("input");
       String input=br.readLine();
       String words[]=input.split(" ");
       int n=Integer.parseInt(words[0]);
       long w=Long.parseLong(words[1]);
       long l=Long.parseLong(words[2]);
       long h[]=new long[n];
       long r[]=new long[n];
       long rcopy[]=new long[n];
       long hcopy[]=new long[n];
       long months=1,sum=0,chk=0;
       for(int i=0;i<n;i++)
       {
           String input2=br.readLine();
           String words2[]=input2.split(" ");
           h[i]=Long.parseLong(words2[0]);
           r[i]=Long.parseLong(words2[1]);
       }
       for(int i=0;i<n;i++)
       {
           if(h[i]>l)
           chk+=h[i];
       }
       if(chk<w)
       {
           for(int i=0;i<n;i++)
           {
               rcopy[i]=r[i];
           }
           Arrays.sort(rcopy);
           months+=(l/rcopy[n-1]);
           while(w>sum)
           {
               sum=0;
               months++;
               for(int i=0;i<n;i++)
               {
                   long a=h[i];
                   a=h[i]+(r[i]*months);
                   if(a>l)
                   sum+=a;
                }
            }
           System.out.println(months);
       }
       else
       System.out.println("0");
    }
}