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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        TreeNode output = new TreeNode(root.val);
        output.left = pruneTree(root.left);
        output.right = pruneTree(root.right);
        if(output.val == 0 && output.left == null && output.right == null) {
            return null;
        }

        return output;
    }
}