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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
         List<List<Integer>> ans = new ArrayList<>();
         if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int current=1;
        while(q.size()>0) {
             int forward=0;
             List<Integer> list = new ArrayList<>();
             while(current!=0)
                {
                current--;
                TreeNode s=q.remove();
                list.add(s.val);
                if(s.left!=null) {q.add(s.left); forward++;}
                if(s.right!=null) {q.add(s.right); forward++;}
                }
            ans.add(list);
            current=forward;
            forward=0;

        }
        return ans;
    }
}