import java.util.*;
class Prob_342 {
    public boolean isPowerOfFour(int n) {
        double div = Math.log(n)/Math.log(4);
        if(div==(int)(div))
        {
            return true;
        }
        return false;
    }
}