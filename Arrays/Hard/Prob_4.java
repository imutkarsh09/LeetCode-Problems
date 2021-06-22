import java.util.*;
class Prob_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length; 
        int[] merged = new int[l1+l2];
        int i=0, j=0, k=0;
        while(i<l1 && j<l2)
        {
            if(nums1[i]<nums2[j])
            {
                merged[k++] = nums1[i++];
            }
            else
            {
                merged[k++] = nums2[j++];
            }
        }
        while(i<l1)
        {
            merged[k++] = nums1[i++];
        }
        while(j<l2)
        {
            merged[k++] = nums2[j++];
        }
        // System.out.println(k);
        double med;
        if(k%2==0)
        {
            // System.out.println("Inside this");
            // System.out.println(merged[k/2]+" "+merged[(k/2)+1]);
            med = (double)((merged[(k/2)-1] + merged[(k/2)]))/2;
        }
        else
        {
            med = merged[k/2];
        }
        return med;
    }
}