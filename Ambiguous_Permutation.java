/*Example: 1 6 3 4 2 5
You have that permutation of 6 numbers(from 1 to 6).
Now, for the inverse you start looking from 1 to 6 the numbers in the example, I mean:
The number 1 in wich position is located at 1 6 3 4 2 5? It is located first. So, the first number in the inverse is 1.
Inverse so far: 1XXXXX
The number 2 in wich position is located at 1 6 3 4 2 5? It is located 5th. So, the second number in the inverse is 5.
Inverse so far:15XXXX
The number 6 in wich position is located at 1 6 3 4 2 5? It is located 2nd. So, the 6th position in the inverse is 2.
Inverse so far:153462 */
import java.io.*;
import java.util.*;
class Ambiguous_Permutation
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int k=Integer.parseInt(br.readLine());
        String res[]=new String [100000];
        int u=0;
        while(k!=0)
        {
            int arr[]=new int[k];
            int arr1[]=new int[k];
            System.out.println("enter values");
            for(int i=0;i<k;i++)
            arr[i]=sc.nextInt();
            int max=0,min=arr[0],flag=0;
            for(int i=0;i<k;i++)
            {
                int k2=arr[i]-1;
                int posk2=i+1;
                arr1[k2]=posk2;
            }
            for(int i=0;i<k;i++)
            {
                if(arr[i]!=arr1[i])
                flag=1;
            }
            if(flag==0)
            res[u++]="ambiguous";
            else
            res[u++]="not ambiguous";
            System.out.println("enter number");
            k=Integer.parseInt(br.readLine());
        }
        for(int p=0;p<u;p++)
        {
           System.out.println(res[p]);
        }
        sc.close();
    }
}
    