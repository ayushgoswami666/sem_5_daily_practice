// Last updated: 3/2/2026, 9:40:20 PM
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
17    public TreeNode searchBST(TreeNode root, int val) {
18        if (root == null) {
19            return null;
20        }
21        if (root.val == val) {
22            return root;
23        } else if (root.val > val) {
24            return searchBST(root.left, val);
25        } else {
26            return searchBST(root.right, val);
27        }        
28    }
29}