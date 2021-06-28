import java.util.*;
class Prob_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(left<=right)
        {
            int area = Math.min(height[left],height[right]) * (right-left);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            max_area = Math.max(area,max_area);
        }
        return max_area;
    }
}