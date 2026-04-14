// Last updated: 4/14/2026, 11:06:00 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
13		if (original == null || original == target)
14			return cloned;
15		TreeNode res = getTargetCopy(original.left, cloned.left, target);
16		if (res != null)
17			return res;
18		return getTargetCopy(original.right, cloned.right, target);
19	}
20}