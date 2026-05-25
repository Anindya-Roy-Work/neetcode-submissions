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

    private Map<TreeNode, Integer> mp = new HashMap<>();

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        int d = lh+rh;
        int subdm = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(subdm,d);
    }

    private int maxHeight(TreeNode root){
        if(root == null) return 0;
        if(mp.containsKey(root)) return mp.get(root);
        mp.put(root, 1+Math.max(maxHeight(root.left),maxHeight(root.right)));
        return mp.get(root);
    }
}
