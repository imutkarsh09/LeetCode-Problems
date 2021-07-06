import java.util.*;
class Prob_94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
        {
            List<Integer> bs = new ArrayList<>();
            return bs;
        }
        List<Integer> le = inorderTraversal(root.left);
        List<Integer> ri = inorderTraversal(root.right);
        List<Integer> li = new ArrayList<>();
        for(int i:le)
        {
            li.add(i);
        }
        li.add(root.val);
        for(int i:ri)
        {
            li.add(i);
        }
        return li;
    }
}