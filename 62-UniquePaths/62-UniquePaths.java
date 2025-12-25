// Last updated: 12/25/2025, 10:34:11 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m+1][n+1];
4        for(int[] row:dp){
5            Arrays.fill(row,-1);
6        }
7        return Path(m,n,1,1,dp);
8        
9    }
10    public static  int Path(int m,int n,int i ,int j,int[][] dp){
11        if(i>m ||j>n){
12            return 0;
13        }
14        if(i==m && j==n){
15            return 1;
16        }
17        if(dp[i][j]!=-1){
18            return dp[i][j];
19        }
20        int right = Path(m,n,i,j+1,dp);
21        int down = Path(m,n,i+1,j,dp);
22        return dp[i][j] = right + down;
23       
24
25
26
27    }
28}