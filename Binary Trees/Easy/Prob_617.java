import java.util.*;
class Prob_617
 {
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
    public void merge(TreeNode p1, TreeNode root1, TreeNode p2, TreeNode root2)
    {
        if(root1==null && root2==null)
        {
            return;
        }
        if(root2==null)
        {
            return;
        }
        if(root1==null && p2.left==root2)
        {
            p1.left= root2;
            return;
        }
        if(root1==null && p2.right==root2)
        {
            p1.right=root2;
            return;
        }
        merge(root1,root1.left,root2,root2.left);
        if(root1!=null && root2!=null)
        {
            root1.val = root1.val + root2.val;
        }
        merge(root1,root1.right,root2,root2.right);
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
        {
            return root2;
        }
        if(root2==null)
        {
            return root1;
        }
        merge(root1,root1,root2,root2);
        return root1;
    }
}