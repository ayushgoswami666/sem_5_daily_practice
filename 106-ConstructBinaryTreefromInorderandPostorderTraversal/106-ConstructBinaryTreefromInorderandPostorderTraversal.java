// Last updated: 12/5/2025, 10:31:45 PM
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
17  public TreeNode buildTree(int[] inorder, int[] postorder) {
18    Map<Integer, Integer> inToIndex = new HashMap<>();
19
20    for (int i = 0; i < inorder.length; ++i)
21      inToIndex.put(inorder[i], i);
22
23    return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inToIndex);
24  }
25
26  TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
27                 Map<Integer, Integer> inToIndex) {
28    if (inStart > inEnd)
29      return null;
30
31    final int rootVal = postorder[postEnd];
32    final int rootInIndex = inToIndex.get(rootVal);
33    final int leftSize = rootInIndex - inStart;
34
35    TreeNode root = new TreeNode(rootVal);
36    root.left = build(inorder, inStart, rootInIndex - 1, postorder, postStart,
37                      postStart + leftSize - 1, inToIndex);
38    root.right = build(inorder, rootInIndex + 1, inEnd, postorder, postStart + leftSize,
39                       postEnd - 1, inToIndex);
40    return root;
41  }
42}