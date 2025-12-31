// Last updated: 12/31/2025, 10:28:51 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
4        for(int[] row:dp){
5            Arrays.fill(row,-1);
6        }
7        return uniquepath(obstacleGrid,0,0,dp);
8        
9    }
10    public static int uniquepath(int[][] obstacle,int i ,int j,int[][] dp){
11        if(i>obstacle.length-1 || j>obstacle[0].length-1){
12            return 0;
13        }
14        if(obstacle[i][j]==1){
15            return 0;
16        }
17        if(i==obstacle.length-1 && j==obstacle[0].length-1){
18            return 1;
19        }
20        
21        if(dp[i][j]!=-1){
22            return dp[i][j];
23        }
24
25        int left = uniquepath(obstacle,i,j+1,dp);
26        int right = uniquepath(obstacle,i+1,j,dp);
27        return dp[i][j] = left + right;
28    }
29}