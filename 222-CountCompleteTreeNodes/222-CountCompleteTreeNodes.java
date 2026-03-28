// Last updated: 3/28/2026, 11:10:15 PM
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
17    int count = 1; // root
18    public int countNodes(TreeNode root) {
19        if(root == null) return 0;
20        if(root.right!=null){
21            countNodes(root.right);
22            count++;
23        }
24        if(root.left!=null){
25            countNodes(root.left);
26            count++;
27        }
28        return count;
29    }
30}