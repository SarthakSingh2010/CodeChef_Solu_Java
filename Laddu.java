import java.io.*;
class Laddu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input");
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int answer=0;
            String input=br.readLine();
            String w[]=input.split(" ");
            String origin=w[1];
            int activities=Integer.parseInt(w[0]);
            String act[]=new String[activities];
            int points=0;
            for(int j=0;j<activities;j++)
            act[j]=br.readLine();
            for(int j=0;j<activities;j++)
            {
                if(act[j].contains("CONTEST_WON")==true)
                {
                    String s=act[j].substring(act[j].indexOf(' ')+1);
                    int rank=Integer.parseInt(s);
                    if(rank<=20)
                    points+=300+20-rank;
                    else
                    points+=300;
                }
                else if(act[j].contains("TOP_CONTRIBUTOR")==true)
                {
                    points+=300;
                }
                else if(act[j].contains("BUG_FOUND")==true)
                {
                    String s=act[j].substring(act[j].indexOf(' ')+1);
                    int severity=Integer.parseInt(s);
                    points+=severity;
                }
                else if(act[j].contains("CONTEST_HOSTED")==true)
                {
                    points+=50;
                }
            }
            if(origin.compareTo("INDIAN")==0)
            {
                answer=points/200;
            }
            else
            {
                answer=points/400;
            }
            System.out.println(answer);
        }
    }
}