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
    public List<List<Integer>> level(TreeNode root){
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> adj = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top = q.remove();
                adj.add(top.val);
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            if(level%2==1){
                Collections.reverse(adj);
            }
            arr.add(adj);
            level++;
        }
        return arr;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> res = new ArrayList<>();
        return level(root);
        
    }
}