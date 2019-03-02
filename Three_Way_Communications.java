import java.util.*;
class Three_Way_Communications
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int y=0;y<t;y++)
        {
            int d=sc.nextInt();
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            double r=(double)d;
            if(dist(p1,p2,q1,q2)<=r && dist(p1,p2,r1,r2)<=r || dist(q1,q2,r1,r2)<=r && dist(p1,p2,r1,r2)<=r || dist(q1,q2,p1,p2)<=r && dist(q1,q2,r1,r2)<=r)
			System.out.println("yes");
            else
            System.out.println("no");
        }
    }
    public static double dist(int x1,int y1,int x2,int y2)
    {
        return(Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2)));
    }
}
