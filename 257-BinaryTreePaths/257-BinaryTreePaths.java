// Last updated: 10/19/2025, 9:41:09 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l1 = new ArrayList<>();
        path(root,"",l1);
        return l1;

        
    }
    public static void path(TreeNode root,String str,List<String> l1){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            l1.add(str+root.val);

        }
        path(root.left, str +root.val+"->",l1);
        path(root.right, str +root.val+"->",l1);

    }

}