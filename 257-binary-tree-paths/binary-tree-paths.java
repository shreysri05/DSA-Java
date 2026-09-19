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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> ans= new ArrayList<>();
        String s ="";
        if(root.left==null && root.right==null) {
             s +=root.val;
             ans.add(s);
             return ans;
        }
        
       dfs(root,s,ans);
       return ans;

    }
     void dfs(TreeNode root,String s,List <String> ans){
        if(root ==null ) return ;
        if(root.left==null && root.right==null){
          
            s+="->"+root.val;
            ans.add(s);
            s=s.substring(0,s.length()-3);
           
        } if(s.isEmpty()) s+=root.val;
          else s+="->"+root.val; 
        dfs( root.left, s, ans);
        dfs( root.right, s, ans);
    }
}