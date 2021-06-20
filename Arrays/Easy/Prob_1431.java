import java.util.*;
class Prob_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max, candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            int total = candies[i]+extraCandies;
            ans.add(total>=max);
        }
        return ans;
    }
}