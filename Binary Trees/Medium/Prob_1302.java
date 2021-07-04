import java.util.*;
class Prob_1302 {
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
    public int getHeight(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int th = Math.max(lh,rh) + 1;
        return th;
    }
    public int getSumDeep(TreeNode root,int hh, int height)
    {
        if(root==null)
        {
            return 0;
        }
        int lsd = getSumDeep(root.left,hh+1,height);
        int rsd = getSumDeep(root.right,hh+1,height);
        int sum = lsd+rsd;
        if(hh==height)
        {
            sum = sum + root.val;
        }
        return sum;
    }
    public int deepestLeavesSum(TreeNode root) {
        int height = getHeight(root);
        int ans = getSumDeep(root,1, height);
        return ans;
    }
}