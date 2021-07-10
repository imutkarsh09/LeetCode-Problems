import java.util.*;
class Prob_102 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            List<Integer> li = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode top = q.poll();
                li.add(top.val);
                if(top.left!=null)
                {
                    q.add(top.left);
                }
                if(top.right!=null)
                {
                    q.add(top.right);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}