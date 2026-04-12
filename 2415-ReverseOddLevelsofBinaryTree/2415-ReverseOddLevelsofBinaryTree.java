// Last updated: 4/12/2026, 11:41:56 PM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        // if (root == null || root.left == null || root.right == null) 
19        //     return root;
20        
21        levelTraverse(root.left, root.right, 0);
22        return root;
23    }
24
25    private void levelTraverse(TreeNode node1, TreeNode node2, int level) {
26        if (node1 == null || node2 == null)
27            return;
28        
29        if (level % 2 == 0) {
30            int val = node1.val;
31            node1.val = node2.val;
32            node2.val = val;
33        }
34
35        levelTraverse(node1.left, node2.right, level + 1);
36        levelTraverse(node1.right, node2.left, level + 1);
37    }
38}