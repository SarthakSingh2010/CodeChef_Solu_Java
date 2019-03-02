import java.util.Scanner;
class PieceOfCake
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT");
        int t=sc.nextInt();
        if(t>=1&&t<=1000)
        {
            for(int i=1;i<=t;i++)
            {
                String s=sc.next();
                int store[]=new int[s.length()];
                int m=0;
                if(s.length()>=1&&s.length()<=50)
                {
                    for(char c='a';c<='z';c++)
                    {
                        int count=0;
                        for(int a=0;a<=s.length()-1;a++)
                        {
                            if(s.charAt(a)==c)
                            count++;
                        }
                        if(count!=0)
                        store[m++]=count;
                    }
                    {
                        PieceOfCake obj=new PieceOfCake();
                        if(obj.check(store)==true)
                        System.out.println("YES");
                        else
                        System.out.println("NO");
                    }
                }
            }
        }
        sc.close();
    }
    public boolean check(int arr[])
    {
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("arr["+i+"]= "+arr[i]+"  arr.length-arr["+i+"]= "+(arr.length-arr[i]));
            if(arr[i]==(arr.length-arr[i]))  
            return true;
        }
        return false;
    }
}
