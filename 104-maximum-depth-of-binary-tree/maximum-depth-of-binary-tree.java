/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(depth(root.left,1),depth(root.right,1));
    }
     int depth(TreeNode root,int depth){
        if(root==null) return depth;
       int a = depth(root.left,depth+1),b=depth(root.right,depth+1);
         return Math.max(a,b);
        
    
    }
}