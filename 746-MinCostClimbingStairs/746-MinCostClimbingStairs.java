// Last updated: 12/25/2025, 12:28:50 AM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int[] dp = new int[cost.length];
4        Arrays.fill(dp,-1);
5        int first = climbing_stair(cost,0,dp);
6        int Zero = climbing_stair(cost,1,dp);
7        return Math.min(first,Zero);
8        
9    }
10    public static int climbing_stair(int[] cost,int i,int[] dp){
11        if(i>=cost.length){
12            return 0;
13        }
14        if(dp[i]!=-1){
15            return dp[i];
16        }
17        int f = climbing_stair(cost,i+2,dp);
18        int s = climbing_stair(cost,i+1,dp);
19        return dp[i]=Math.min(f,s)+cost[i];
20    }
21}