// Last updated: 3/5/2026, 11:07:00 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int sum = 0;
18    
19    public TreeNode bstToGst(TreeNode root) {  
20        if (root != null) {
21            bstToGst(root.right);  // Traverse the right subtree
22            sum += root.val;  // Update the sum
23            root.val = sum;  // Update the current node's value
24            bstToGst(root.left);  // Traverse the left subtree
25        }
26        return root;
27    }
28}