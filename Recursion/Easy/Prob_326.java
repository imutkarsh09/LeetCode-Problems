import java.util.*;
class Prob_326
{
    public boolean isPowerOfThree(int n) {
        
        if(n==1)
        {
            return true;
        }
        if(n<1)
        {
            return false;
        }
        if(n%3!=0)
        {
            return false;
        }
        boolean bythree = isPowerOfThree(n/3);
        return bythree;
    }
}