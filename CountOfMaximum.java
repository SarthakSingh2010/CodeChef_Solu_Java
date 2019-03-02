import java.util.*;
class CountOfMaximum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter test cases");
    int t=sc.nextInt();
    int ap[][]=new int [t][2];
    for(int t1=0;t1<t;t1++)
    {
        int l=sc.nextInt();
        int a[]=new int [l];
        for(int i=0;i<l;i++)
        a[i]=sc.nextInt();
        Arrays.sort(a);
        int c=0,max=0,maxitem=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
            if(a[i]==a[j])
            c++;
            }
            if(c>max)
            {
                max=c;
                maxitem=a[i];
            }
            c=0;
        }
        ap[t1][0]=maxitem;
        ap[t1][1]=max;
    }
    for(int i=0;i<t;i++)
    {
        for(int j=0;j<2;j++)
        System.out.print(ap[i][j]+" ");
        System.out.println();
    }    
}
}