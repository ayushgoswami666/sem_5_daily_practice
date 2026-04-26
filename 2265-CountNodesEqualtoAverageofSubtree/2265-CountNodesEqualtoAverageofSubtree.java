// Last updated: 4/27/2026, 12:22:21 AM
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
17    private int matchingSubtreeCount = 0; // Initialize the count of subtrees with matching averages.
18
19    // A Depth-First Search (DFS) function that returns an array of two values:
20    // - The sum of values within the current subtree.
21    // - The number of nodes within the current subtree.
22    private int[] calculateSubtreeValues(TreeNode currentNode) {
23        if (currentNode == null)
24            return new int[]{0, 0}; // Base case: Return 0 for both sum and number of nodes if the node is null.
25
26        // Recursively calculate values for the left and right subtrees.
27        int[] leftSubtree = calculateSubtreeValues(currentNode.left);
28        int[] rightSubtree = calculateSubtreeValues(currentNode.right);
29
30        // Calculate the sum of values and the number of nodes in the current subtree.
31        int sumOfValues = leftSubtree[0] + rightSubtree[0] + currentNode.val;
32        int numberOfNodes = leftSubtree[1] + rightSubtree[1] + 1;
33
34        // Check if the current node's value matches the average of its subtree.
35        if (sumOfValues / numberOfNodes == currentNode.val)
36            matchingSubtreeCount++;
37
38        return new int[]{sumOfValues, numberOfNodes}; // Return the calculated values for the current subtree.
39    }
40
41    public int averageOfSubtree(TreeNode root) {
42        calculateSubtreeValues(root); // Start the DFS from the root node.
43        return matchingSubtreeCount; 
44    }
45}