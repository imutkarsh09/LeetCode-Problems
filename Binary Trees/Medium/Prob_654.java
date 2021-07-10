import java.util.*;
public class Prob_654
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int getMax(int[] Ar, int low, int high)
    {
        int max = Integer.MIN_VALUE;
        int idx=-1;
        for(int i=low;i<=high;i++)
        {
            if(Ar[i]>max)
            {
                max = Ar[i];
                idx = i;
            }
        }
        return idx;
    }
    public static Node getNode(int[] Ar, int low, int high)
    {   if(low > high) return null;
        if(low == high) return  new Node(Ar[low],null,null);
        int max = getMax(Ar,low,high);
        Node root = new Node(Ar[max],null,null);
        root.left = getNode(Ar,low,max-1);
        root.right = getNode(Ar,max+1,high);
        return root;
    }
    public static void display(Node node)
    {
        if(node==null)
        {
            return;
        }
        String str = "";
        if(node.left!=null)
        {
            str = str + node.left.data;
        }
        else
        {
            str = str+".";
        }
        str = str +"<-"+node.data+"->";
        if(node.right!=null)
        {
            str = str+node.right.data;
        }
        else
        {
            str = str+".";
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Ar = new int[n];
        for(int i=0;i<n;i++)
        {
            Ar[i] = sc.nextInt();
        }
        Node root = getNode(Ar,0,n-1);
        System.out.println(root.data);
        display(root);
    }
}