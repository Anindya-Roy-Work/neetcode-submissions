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

    private int diam = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diam;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        diam = Math.max(diam,l+r);
        return 1+Math.max(l,r);
    }

}
