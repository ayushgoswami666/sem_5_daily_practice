// Last updated: 12/26/2025, 10:18:58 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n+1];
4        return climbstair(n,dp);
5        
6    }
7    public static int climbstair(int n,int[] dp){
8        if(n==0){
9            return 1;
10        }
11        if(dp[n]!=0){
12            return dp[n];
13        }
14        int inc =0,exc=0;
15        if(n>=2){
16            inc = climbstair(n-2,dp);
17
18        }
19        exc = climbstair(n-1,dp);
20        return dp[n]=inc+exc;
21
22    }
23}