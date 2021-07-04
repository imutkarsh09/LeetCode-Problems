import java.util.*;
class Prob_1315
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

    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)                            
		{                                                                   
            return 0;                                                  
        }
        sumEvenGrandparent(root.left);      
        if(root.val%2==0)
        {
            sum = sum+getSum(0,root);   
        }
        sumEvenGrandparent(root.right);
        return sum;
    }
	public int getSum(int cnt, TreeNode root)
    {                                                   
        if(root==null || cnt>2)
        {
            return 0;
        }
        int ls = getSum(cnt+1,root.left);  
        int rs = getSum(cnt+1,root.right);
        int ts = ls+rs;
        if(cnt==2)                                  
        {
            ts=ts+root.val;
        }
        return ts;                                   
    }
}