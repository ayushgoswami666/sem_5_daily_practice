// Last updated: 3/4/2026, 10:16:08 PM
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
18    public TreeNode convertBST(TreeNode root) {
19        transformation(root);
20        return root;
21    }
22
23    public void transformation(TreeNode root){
24
25        if(root == null){
26            return;
27        }
28
29        transformation(root.right);
30
31        root.val = root.val + sum;
32        sum = root.val;
33
34        transformation(root.left);
35        
36    }
37}