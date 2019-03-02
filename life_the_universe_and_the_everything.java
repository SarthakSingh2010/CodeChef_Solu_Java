import java.io.*;
class life_the_universe_and_the_everything
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        int a=Integer.parseInt(br.readLine());
        while(a!=42)
        {
            System.out.println(a);
            a=Integer.parseInt(br.readLine());
        }
    }
}
        