// Last updated: 4/13/2026, 11:54:42 PM
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
17        public int deepestLeavesSum(TreeNode root) {
18        int res = 0, i;
19        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
20        q.add(root);
21        while (!q.isEmpty()) {
22            for (i = q.size() - 1, res = 0; i >= 0; --i) {
23                TreeNode node = q.poll();
24                res += node.val;
25                if (node.right != null) q.add(node.right);
26                if (node.left  != null) q.add(node.left);
27            }
28        }
29        return res;
30    }
31}