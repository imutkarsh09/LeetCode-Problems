import java.util.*;
class Prob_16 {
    public int threeSumClosest(int[] nums, int target) {
        int prevdiff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target) {
                    return sum;
                } 
                int diff = Math.abs(sum-target);
                if(diff < prevdiff) {
                    prevdiff = diff;
                    ans=sum;
                }
                if(sum < target) j++;
                else k--;
            }
        }
        return ans;
    }
}