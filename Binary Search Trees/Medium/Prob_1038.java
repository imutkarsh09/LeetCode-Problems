class Prob_1038 {
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
    int sum=0;
    public void btg(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        btg(node.right);
        sum=sum+node.val;
        node.val = sum;
        btg(node.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        btg(root);
        return root;
    }
}