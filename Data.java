import java.io.*;
class Data
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input");
        String s[]=new String[200];
        for(int i=0;i<200;i++)
        s[i]=br.readLine();
        System.out.println("\n\n\n");
        for(int i=0;i<200;i++)
        {
            System.out.println(s[i]+",");
        }
    }
}
