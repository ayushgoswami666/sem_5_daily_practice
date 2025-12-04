// Last updated: 12/4/2025, 11:08:40 PM
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
17    Map<Pair<Integer, Integer>, List<TreeNode>> dp; 
18    public List<TreeNode> generateTrees(int n) {
19        dp = new HashMap<>();
20        return helper(1, n);
21    }
22    
23    public List<TreeNode> helper(int start, int end) {
24        List<TreeNode> variations = new ArrayList<>();
25        if (start > end) {
26            variations.add(null);
27            return variations;
28        }
29        if (dp.containsKey(new Pair<>(start, end))) {
30            return dp.get(new Pair<>(start, end));
31        }
32        for (int i = start; i <= end; ++i) {
33            List<TreeNode> leftSubTrees = helper(start, i - 1);
34            List<TreeNode> rightSubTrees = helper(i + 1, end);
35            for (TreeNode left: leftSubTrees) {
36                for (TreeNode right: rightSubTrees) {
37                    TreeNode root = new TreeNode(i, left, right);
38                    variations.add(root);
39                }
40            }
41        }
42        dp.put(new Pair<>(start, end), variations);
43        return variations;
44    }   
45}