import java.io.*;
class DoubleString
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter cases");
        int c=Integer.parseInt(br.readLine());
        int arr[]=new int[c];
        //System.out.println("length of palindrome");
        for(int i=0;i<c;i++)
        arr[i]=Integer.parseInt(br.readLine());
        for(int j=0;j<c;j++)
        {
           if(arr[j]%2==0)
              System.out.println(arr[j]);
           else
              System.out.println(arr[j]-1);
        }
    }
}