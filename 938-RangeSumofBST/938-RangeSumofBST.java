// Last updated: 3/7/2026, 11:10:03 PM
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
17    public int sum=0;
18    public int rangeSumBST(TreeNode root, int low, int high) {
19        if(root==null)return 0;
20        if(root.val>=low && root.val<=high)sum+=root.val;
21        if(root.val<high)rangeSumBST(root.right,low,high);
22        if(root.val>low)rangeSumBST(root.left,low,high);
23        return sum;
24    }
25}