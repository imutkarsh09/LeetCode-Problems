import java.util.*;
class Prob_637 {
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            double sum=0;
            int cnt = q.size();
            for(int i=0;i<cnt;i++)
            {
                TreeNode node = q.poll();
                sum+=node.val;
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            ans.add(sum/cnt);
        }
        return ans;
    }
}