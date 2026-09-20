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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        check(root,ans,0);
        return ans;
    }
     void check (TreeNode root,List<Integer> ans,int index){
        if(root==null) return;
        if(index==ans.size()) ans.add(index,root.val);
         else ans.set(index,root.val);
        check(root.left,ans,index+1);
        check(root.right,ans,index+1);

    }
     }