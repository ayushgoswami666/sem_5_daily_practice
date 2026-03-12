// Last updated: 3/12/2026, 11:55:29 PM
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
17    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
18        Stack<TreeNode> st1 = new Stack<>();
19        Stack<TreeNode> st2 = new Stack<>();
20        
21        List<Integer> res = new ArrayList<>();
22        
23        while(root1 != null || root2 != null || !st1.empty() || !st2.empty()){
24            while(root1 != null){
25                st1.push(root1);
26                root1 = root1.left;
27            }
28            while(root2 != null){
29                st2.push(root2);
30                root2 = root2.left;
31            }
32            if(st2.empty() || (!st1.empty() && st1.peek().val <= st2.peek().val)){
33                root1 = st1.pop();
34                res.add(root1.val);
35                root1 = root1.right;
36            }
37            else{
38                root2 = st2.pop();
39                res.add(root2.val);
40                root2 = root2.right;
41            }
42        }
43        return res;
44    }
45}