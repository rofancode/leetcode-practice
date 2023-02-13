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
        //Baniary search 
        // 왼쪽은 node 기준 작고 왼쪽 < node
        // 오른쪽은 node기준 크다 node < 오른쪽
        // val은 int 기준 최대 최소값까지 가능
        // node1 왼쪽 => node2 오른쪽  node2 < val < node1  
        if (root == null) return true;
        return isValid(null, null, root);
    }
    
    public boolean isValid(Integer max, Integer min, TreeNode node){
        
        if(node == null) return true;
        if(max != null && node.val >= max || min != null && node.val <= min)
            return false; 
        return isValid(node.val, min , node.left)&& isValid(max, node.val, node.right);
    }
}