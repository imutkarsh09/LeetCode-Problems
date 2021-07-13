import java.util.*;
class Prob_231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        {
            return true;
        }
        if(n<1)
        {
            return false;
        }
        if(n%2!=0)
        {
            return false;
        }
        boolean half = isPowerOfTwo(n/2);
        return half;
    }
}