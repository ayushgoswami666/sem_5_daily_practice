// Last updated: 12/26/2025, 12:24:52 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        return CoinChange(amount,coins);
4        
5    }
6    public static int CoinChange(int amount, int[] coin){
7        int[][] dp = new int[amount+1][coin.length+1];
8        for(int i =0;i<dp[0].length;i++){
9            dp[0][i]= 1;
10        }
11        for(int i = 1;i<dp.length;i++){
12            for(int j = 1;j<dp[0].length;j++){
13                int inc =0;
14                int exc = 0;
15                if(coin[j-1]<=i){
16                    inc = dp[i-coin[j-1]][j];
17                }
18                exc = dp[i][j-1];
19                dp[i][j] = inc+exc;
20            }
21        }
22        return dp[dp.length-1][dp[0].length-1];
23    }
24}