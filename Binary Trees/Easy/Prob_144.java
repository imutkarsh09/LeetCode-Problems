import java.util.*;
class Prob_144 {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        {
            List<Integer> bs = new ArrayList<>();
            return bs;
        }
        List<Integer> le = preorderTraversal(root.left);
        List<Integer> ri = preorderTraversal(root.right);
        List<Integer> li = new ArrayList<>();
        li.add(root.val);
        for(int i:le)
        {
            li.add(i);
        }
        for(int i:ri)
        {
            li.add(i);
        }
        return li;
    }
}