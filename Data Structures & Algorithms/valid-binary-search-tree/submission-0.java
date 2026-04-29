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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return (isValidBST(root.left,Integer.MIN_VALUE,root.val) && isValidBST(root.right,root.val,Integer.MAX_VALUE));
    }

    private boolean isValidBST(TreeNode root, int a, int b){
        if(root == null) return true;
        if(root.val <= a || root.val >= b) return false;
        return isValidBST(root.left,a,root.val) && isValidBST(root.right,root.val,b);
    }

}
