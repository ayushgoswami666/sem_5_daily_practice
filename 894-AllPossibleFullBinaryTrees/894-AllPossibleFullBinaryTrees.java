// Last updated: 3/21/2026, 11:28:06 PM
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
17    static Map<Integer, List<TreeNode>> saved = new HashMap<>();
18    
19    public List<TreeNode> allPossibleFBT(int n) {
20        if (n%2==0)
21            return new ArrayList<>();
22
23        if (!saved.containsKey(n)) {
24            List<TreeNode> list = new ArrayList<>();
25            
26            if (n==1)
27                list.add(new TreeNode(0));
28            else {
29                for (int i=1; i<=n-1; i+=2) {
30                    List<TreeNode> lTrees = allPossibleFBT(i);
31                    List<TreeNode> rTrees = allPossibleFBT(n-i-1);
32
33                    for (TreeNode lt: lTrees) {
34                        for (TreeNode rt: rTrees) {
35                            list.add(new TreeNode(0, lt, rt));
36                        }
37                    }
38                }
39            }
40
41            saved.put(n, list);
42        }
43        return saved.get(n);
44    }
45}