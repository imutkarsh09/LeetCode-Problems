import java.util.*;
class Prob_590 
{
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int last = fib(n-1);
        int secLast = fib(n-2);
        int here = last + secLast;
        return here;
    }
}