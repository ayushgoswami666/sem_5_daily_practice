// Last updated: 8/16/2025, 11:35:56 PM
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
    int max_depth=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        rightview(root,1,l1);
        return l1;
        
    }
    public void rightview(TreeNode root,int curr_level,List<Integer> l1){
        if(root == null){
            return ;
        }
        if(max_depth<curr_level){
            l1.add(root.val);
            max_depth=curr_level;
        }

        rightview(root.right,curr_level+1,l1);
        rightview(root.left,curr_level+1,l1);

    }
}