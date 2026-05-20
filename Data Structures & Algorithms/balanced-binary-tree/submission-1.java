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

    Map<TreeNode, Integer> mp = new HashMap<>();

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lheight = height(root.left);
        int rheight = height(root.right);
        return (Math.abs(lheight-rheight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    private int height(TreeNode root){
        if(root == null) return 0;
        if(mp.containsKey(root)) return mp.get(root);
        int lh = height(root.left);
        int rh = height(root.right);
        mp.put(root.left,lh);
        mp.put(root.right,rh);
        return 1 + Math.max(lh,rh);
    }

}
