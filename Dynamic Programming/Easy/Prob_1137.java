import java.util.*;
class Prob_1137 {
    public int getAns(int n, int[] qb)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int n1 = getAns(n-1,qb);
        int n2 = getAns(n-2,qb);
        int n3 = getAns(n-3,qb);
        int tot = n1+n2+n3;
        qb[n] = tot;
        return tot;
    }
    public int tribonacci(int n) {
        int ans  = getAns(n,new int[n+1]);
        return ans;
    }
}