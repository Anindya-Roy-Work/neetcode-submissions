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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lis = new ArrayList<>();
        inorder(root,k,lis);
        return lis.get(k-1);
    }

    void inorder(TreeNode root, int k, List<Integer> lis){
        if(root == null) return;
        if(lis.size() == k) return;
        inorder(root.left,k,lis);
        lis.add(root.val);
        inorder(root.right,k,lis);
    }

}
