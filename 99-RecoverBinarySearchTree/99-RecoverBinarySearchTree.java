// Last updated: 2/28/2026, 9:54:38 PM
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
17    TreeNode first;
18    TreeNode second;
19    TreeNode prev;
20
21    public void recoverTree(TreeNode root) {
22        helper(root);
23        // Swap the values of the two misplaced nodes
24        int temp = first.val;
25        first.val = second.val;
26        second.val = temp;
27    }
28
29    void helper(TreeNode node) {
30        if (node == null) return;
31
32        // Traverse left subtree
33        helper(node.left);
34
35        // Detect swapped nodes
36        if (prev != null && prev.val > node.val) {
37            if (first == null) {
38                first = prev;
39            }
40            second = node;
41        }
42
43        prev = node;
44
45        // Traverse right subtree
46        helper(node.right);
47    }
48}