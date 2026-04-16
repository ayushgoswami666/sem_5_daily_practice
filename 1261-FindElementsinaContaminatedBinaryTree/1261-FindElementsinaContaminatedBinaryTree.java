// Last updated: 4/16/2026, 11:25:36 PM
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
16
17
18class FindElements {
19    BitSet recoveredValues;
20
21    public FindElements(TreeNode root) {
22        root.val = 0;
23        recoveredValues = new BitSet();
24        recoverTree(root);
25    }
26
27    private void recoverTree(TreeNode root) {
28        if (root == null) return;
29        recoveredValues.set(root.val);
30        if (root.left != null) {
31            root.left.val = 2 * root.val + 1;
32            recoverTree(root.left);
33        }
34        if (root.right != null) {
35            root.right.val = 2 * root.val + 2;
36            recoverTree(root.right);
37        }
38    }
39
40    public boolean find(int target) {
41        return recoveredValues.get(target);
42    }
43}
44
45/**
46 * Your FindElements object will be instantiated and called as such:
47 * FindElements obj = new FindElements(root);
48 * boolean param_1 = obj.find(target);
49 */