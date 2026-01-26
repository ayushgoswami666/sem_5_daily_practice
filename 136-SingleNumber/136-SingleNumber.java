// Last updated: 1/27/2026, 12:27:30 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = 0;
4        for(int i :nums){
5            ans = ans^i;
6        }
7        return ans;
8        
9    }
10}