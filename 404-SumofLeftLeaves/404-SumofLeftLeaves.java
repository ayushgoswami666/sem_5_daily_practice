// Last updated: 2/16/2026, 11:10:45 PM
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
17    public int sumOfLeftLeaves(TreeNode root) {
18        return helper(root,false);
19
20    }
21    
22    public int helper(TreeNode root, boolean isleft){
23        if(root==null){
24            return 0;
25        }
26        if(root.left==null && root.right==null){
27            return isleft ? root.val : 0;
28        }
29        
30        
31
32        int a = helper(root.left,true);
33        int b = helper(root.right,false);
34
35        return a+b;
36    }
37}