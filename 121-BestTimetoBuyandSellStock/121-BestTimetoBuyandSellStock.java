// Last updated: 1/2/2026, 9:44:19 AM
1class Solution {
2    public int maxProfit(int[] prices) {  
3        int buy = prices[0];
4        int profit = 0;
5        for(int i =1;i<prices.length;i++){
6            if(prices[i]<buy){
7                buy = prices[i];
8            }
9            else if(prices[i] - buy > profit){
10                profit = prices[i] - buy;
11            }
12        }
13        return profit;
14        
15    }
16}