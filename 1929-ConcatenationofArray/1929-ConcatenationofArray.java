// Last updated: 12/25/2025, 10:47:08 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[2*n];
5        for(int i =0;i<2*n;i++){
6            ans[i] = nums[i%n];
7        }
8        return ans;
9        
10    }
11}