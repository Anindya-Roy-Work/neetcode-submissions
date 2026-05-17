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
        List<Integer> lis = new ArrayList<>();
        rightView(root,0,lis);
        return lis;
    }

    void rightView(TreeNode root, int depth, List<Integer> l){
        if(root == null) return;
        if(l.size()==depth) l.add(root.val);
        rightView(root.right,depth+1,l);
        rightView(root.left,depth+1,l);
    }
}
