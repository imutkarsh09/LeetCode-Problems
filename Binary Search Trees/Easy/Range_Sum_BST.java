import java.util.*;
class Range_Sum_BST {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null)
        {
            return 0;
        }
       if(root.val>=low)
       {
           int leftSum =  rangeSumBST(root.left,low,high);
           sum = sum+leftSum;
       }
        if(root.val<=high)
        {
            int rightSum = rangeSumBST(root.right,low,high);
            sum=sum+rightSum;
        }
        if(root.val>=low && root.val<=high)
        {
            // System.out.println(root.val);
            sum=sum+root.val;
        }
        return sum;
    }
}