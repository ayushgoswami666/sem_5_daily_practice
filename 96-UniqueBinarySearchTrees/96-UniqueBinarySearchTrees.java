// Last updated: 12/4/2025, 11:05:13 PM
1class Solution {
2    public int numTrees(int n) {
3        int dp[] = new int[n+1];
4        dp[0] = 1;
5        dp[1] = 1;
6
7        for (int i=2; i<n+1; i++) {
8            // Ci -> BST (i nodes) -> dp[i]
9            for (int j=0; j<i; j++) {
10                int left = dp[j];
11                int right = dp[i-j-1];
12                dp[i] += left * right;
13            }
14        }
15        return dp[n];
16    }
17}