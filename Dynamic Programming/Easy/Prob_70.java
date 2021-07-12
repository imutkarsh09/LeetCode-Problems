import java.util.*;
class Prob_70 {
    public int getPaths(int n,int[] qb)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int path1 = getPaths(n-1,qb);
        int path2 = getPaths(n-2,qb);
        int tot = path1+path2;
        qb[n]=tot;
        return tot;
    }
    public int climbStairs(int n) {
        int ans = getPaths(n,new int[n+1]);
        return ans;
    }
}