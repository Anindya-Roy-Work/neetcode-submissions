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
        Map<Integer,Integer> mp = new TreeMap<>();
        rightView(root,mp,0);
        return new ArrayList<>(mp.values());
    }

    void rightView(TreeNode root, Map<Integer,Integer> mp,int d){
        if(root == null) return;
        if(mp.get(d) == null){
            //mp.put(d, new ArrayList<>());
            //mp.get(d).add(root.val);
            mp.put(d,root.val);
        }
        rightView(root.right,mp,d+1);
        rightView(root.left,mp,d+1);
    }
}
