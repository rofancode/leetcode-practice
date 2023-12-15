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
       //left < node < right
        return checkBST(root, null, null);
    }
    
    public boolean checkBST(TreeNode node, Integer max, Integer min) {
        if (node == null) return true;
        // check 
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) return false;
        
        
        return checkBST(node.left, node.val, min) && checkBST(node.right, max, node.val);
    }
}