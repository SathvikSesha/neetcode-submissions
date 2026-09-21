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
    int max = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        rec(root);
        return max;
    }
    public int rec(TreeNode root){
        if(root==null) return 0;
        int left = rec(root.left);
        int right = rec(root.right);
        max = Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
