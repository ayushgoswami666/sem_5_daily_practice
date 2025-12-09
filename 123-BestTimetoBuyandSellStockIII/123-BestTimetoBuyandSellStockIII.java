// Last updated: 12/9/2025, 11:13:58 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][][] dp = new int[n + 1][3][2]; // Transactions = 0, 1, 2 and Buy = 0, 1
5
6        // Fill DP table from bottom to top
7        for (int day = n - 1; day >= 0; day--) { 
8            for (int trans = 1; trans <= 2; trans++) { 
9                for (int buy = 0; buy <= 1; buy++) { 
10                    if (buy == 1) { // Buying case
11                        dp[day][trans][buy] = Math.max(
12                            -prices[day] + dp[day + 1][trans][0], // Buy today
13                            dp[day + 1][trans][1] // Skip buying
14                        );
15                    } else { // Selling case
16                        dp[day][trans][buy] = Math.max(
17                            prices[day] + dp[day + 1][trans - 1][1], // Sell today
18                            dp[day + 1][trans][0] // Skip selling
19                        );
20                    }
21                }
22            }
23        }
24        return dp[0][2][1]; // Answer at start (day 0, 2 transactions left, can buy)
25    }
26}