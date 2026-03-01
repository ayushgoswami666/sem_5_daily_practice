// Last updated: 3/1/2026, 10:57:27 PM
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
17    int count = 0, ans = -1;
18
19    private void getVal(TreeNode root, int k) {
20        if (root == null) return;
21        getVal(root.left, k);
22        count++;
23        if (count == k) {
24            ans = root.val;
25            return;
26        }
27        getVal(root.right, k);
28    }
29
30    public int kthSmallest(TreeNode root, int k) {
31        getVal(root, k);
32        return ans;
33    }
34}