// Last updated: 12/24/2025, 11:36:12 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp,-1);
5        return Robber(nums,0,dp);
6
7        
8    }
9    public static int Robber(int[] nums,int i,int[] dp){
10        if(i>=nums.length){
11            return 0;
12        }
13        if(dp[i]!=-1){
14            return dp[i];
15        }
16        int Rob = nums[i] + Robber(nums,i+2,dp);
17        int dontRob = Robber(nums,i+1,dp);
18        return dp[i] = Math.max(Rob,dontRob);
19
20    }
21}