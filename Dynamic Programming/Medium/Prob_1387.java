import java.util.*;
public class Prob_1387
{
    public static class Pair implements Comparable<Pair>
    {
        int num;
        int pow;
        Pair(int num, int pow)
        {
            this.num=num;
            this.pow=pow;
        }
        @Override
        public int compareTo(Prob_1387.Pair o) {
            if(this.pow > o.pow)
            {
                return 1;
            }
            if(this.pow < o.pow)
            {
                return -1;
            }
            return 0;
        }
    }

    public static int getPower(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int po;
        if(n%2==0)
        {
             po = getPower(n/2);
        }
        else
        {
            po = getPower(3*n+1);
        }
        return (po+1);
    }
    public static int getKth(int lo,int hi, int k)
    {
        Pair[] Ar = new Pair[hi-lo+1];
        for(int i=lo;i<=hi;i++)
        {
            int po = getPower(i);
            Pair pair = new Pair(i,po);
            Ar[i-lo] = pair;
        }
        Arrays.sort(Ar);
        return Ar[k-1].num;
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt();
        int hi = sc.nextInt();
        int k = sc.nextInt();
        int ans = getKth(lo,hi,k);
        System.out.println(ans);
    }
}