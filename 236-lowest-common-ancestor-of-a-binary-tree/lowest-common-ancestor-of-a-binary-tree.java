/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
     {int n1=p.val;
     int n2=q.val;
        if(root==null) return null;
        if(root.val==n1||root.val==n2) return root;
        TreeNode left=root.left;
        boolean a=check(left,n1);
        boolean b =check(left,n2);
         if(a&&b) return lowestCommonAncestor( root.left,p,  q);
         if(a||b) return root;
         else return lowestCommonAncestor( root.right,p,  q);
        } 
        boolean check(TreeNode root,int n1){
        if(root==null) return false;
        if(root.val==n1) return true;
        return check( root.left,n1)||check( root.right,n1);       
    }
}