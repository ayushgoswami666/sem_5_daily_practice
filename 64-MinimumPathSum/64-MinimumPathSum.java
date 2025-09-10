// Last updated: 9/10/2025, 12:26:40 PM
class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return Minimum_path(grid,0,0,dp);
        
    }
    public static int Minimum_path(int[][] grid,int cr, int cc,int[][] dp){
        if(cr == grid.length-1 && cc == grid[0].length-1){
            return grid[cr][cc];
        }
        if(cc == grid[0].length || cr == grid.length){
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }
        int d = Minimum_path(grid,cr+1,cc,dp);
        int r = Minimum_path(grid,cr,cc+1,dp);

        return dp[cr][cc] =  Math.min(d,r)+grid[cr][cc];
    }
}