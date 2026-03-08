// Last updated: 3/8/2026, 11:30:05 PM
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
17    TreeNode prev = null;
18    public TreeNode increasingBST(TreeNode root) {
19        TreeNode dummy = new TreeNode(0);
20        prev = dummy;
21        inorder(root);
22        return dummy.right;
23    }
24    private void inorder(TreeNode node) {
25        if (node == null) return;
26        inorder(node.left);
27        node.left = null;    
28        prev.right = node;     
29        prev = node;    
30        inorder(node.right);
31    }
32}