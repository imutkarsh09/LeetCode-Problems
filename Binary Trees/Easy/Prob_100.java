import java.util.*;
class Prob_100 {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true;
        }
        if(p!=null && q==null)
        {
            return false;
        }
        if(p==null && q!=null)
        {
            return false;
        }
        boolean ls = isSameTree(p.left,q.left);
        boolean rs = isSameTree(p.right,q.right);
        if(ls==true && rs ==true && p.val==q.val)
        {
            return true;
        }
        return false;
    }
}