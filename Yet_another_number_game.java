import java.io.*; 
class Yet_another_number_game
{
  public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of cases");
        int T=Integer.parseInt(br.readLine());
        String s[]=new String [T];
        for(int i=0;i<T;i++)
        {
            System.out.println("enter number ");
            int k=Integer.parseInt(br.readLine());
            int c=0,max=0;
            while(k!=1)
            {
            max=0;
            for(int m=1;m<k;m++)
            {
                if(k%m==0)
                {
                    if(m>max)
                    max=m;
                }
            }
            k=k-max;
            c++;
            }
            if(c%2==0)
            s[i]="BOB";
            else
            s[i]="ALICE";
        }
        for(int p=0;p<T;p++)
        System.out.println(s[p]);
        }
    }        