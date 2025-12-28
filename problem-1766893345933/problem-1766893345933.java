// Last updated: 12/28/2025, 9:12:25 AM
1class Solution {
2    public long maximumScore(int[] nums) {
3        int n = nums.length;
4        int[] suf = new int[n];
5        suf[n-1] = nums[n-1];
6        long prefix = 0;
7        long ans = Integer.MIN_VALUE;
8        for(int i = n-2;i>=0;i--){
9            suf[i] = Math.min(suf[i+1],nums[i]);
10        }
11    
12        for(int i=0;i<n-1;i++){
13            prefix += nums[i];
14            
15            ans = Math.max(ans,prefix-suf[i+1]);
16        }
17        return ans;
18        
19    }
20}