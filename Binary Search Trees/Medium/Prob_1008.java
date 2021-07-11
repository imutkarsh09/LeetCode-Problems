import java.util.*;
class Prob_1008{
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
    public TreeNode add(TreeNode root,int val)
    {
        if(root==null)
        {
            return new TreeNode(val);
        }
        if(val<root.val)
        {
            root.left=add(root.left,val);
        }
        else if(val>root.val)
        {
            root.right = add(root.right,val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            TreeNode node = add(root,preorder[i]);
        }
        return root;
    }
}