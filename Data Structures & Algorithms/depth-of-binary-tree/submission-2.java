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

    Map<TreeNode,Integer> mp = new HashMap<>();

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(mp.containsKey(root)) return mp.get(root);
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
