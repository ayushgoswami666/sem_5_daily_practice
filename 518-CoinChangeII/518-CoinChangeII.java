// Last updated: 9/4/2025, 11:36:40 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount +1][coins.length];
        for(int[] a :dp){
            Arrays.fill(a,-1);
        }
        return CC(amount,coins,0,dp);
        
    }
    public static int CC(int amount,int[] coins,int i,int[][] dp){

        if(amount == 0){
            return 1;
        }
        if(i == coins.length){
            return 0;
        }
        if(dp[amount][i] !=-1){
            return dp[amount][i];

        }
        int inc = 0,exc =0;
        if(amount>=coins[i]){
            inc = CC(amount-coins[i],coins,i,dp);

        }
        exc = CC(amount,coins,i+1,dp);
        return dp[amount][i] = inc +exc;
    }
}