// Last updated: 10/19/2025, 9:24:08 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> target = new ArrayList<>();
        List<Integer>  current = new ArrayList<>();
        dfs(root,targetSum,0,target,current);
        return target;
        
    }
    public static void dfs(TreeNode root,int targetSum,int currentSum,List<List<Integer>> target,List<Integer>  current){
        if(root == null){
            return;
        }
        currentSum+=root.val;
        current.add(root.val);
        if(root.left == null && root.right == null && targetSum == currentSum){
            target.add(new ArrayList<>(current));
        }
        dfs(root.left,targetSum,currentSum,target,current);
        dfs(root.right,targetSum,currentSum,target,current);
        current.remove(current.size()-1);

    }
}