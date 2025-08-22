// Last updated: 8/22/2025, 10:33:30 PM
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
    public boolean isBalanced(TreeNode root) {
        return isbalance(root).isbal;
        
    }
    public balancepair isbalance(TreeNode root){
        if(root == null){
            return new balancepair();
        }
        balancepair lbp = isbalance(root.left);
        balancepair rbp =  isbalance(root.right);
        balancepair sb = new balancepair();
        sb.ht = Math.max(lbp.ht ,rbp.ht)+1;
        boolean sbp = Math.abs(lbp.ht -rbp.ht) <=1;
        sb.isbal = lbp.isbal && rbp.isbal && sbp;
        return sb;

    }
    class balancepair{
        int ht = -1;
        boolean isbal = true;
    }
    
}
