import java.util.*;
class Prob_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int sta=0;
        for(int i=0;i<2*n;i=i+2)
        {
            ans[i]=nums[sta];
            ans[i+1]=nums[sta+n];
            sta++;
        }
        return ans;
    }
}