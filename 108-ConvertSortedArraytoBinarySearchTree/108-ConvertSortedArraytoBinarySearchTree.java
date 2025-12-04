// Last updated: 12/4/2025, 11:11:46 PM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return insert(nums, 0, nums.length);
19    }
20
21    // Recursive helper to build BST
22    TreeNode insert(int[] nums, int start, int end) {
23        if (start == end) return null;
24
25        int mid = (start + end) / 2;
26        TreeNode node = new TreeNode(nums[mid]);
27        node.left = insert(nums, start, mid);
28        node.right = insert(nums, mid + 1, end);
29        return node;
30    }
31}