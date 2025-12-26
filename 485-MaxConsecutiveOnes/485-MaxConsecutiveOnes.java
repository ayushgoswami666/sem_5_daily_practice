// Last updated: 12/26/2025, 10:47:30 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int ans = 0;
4        int count = 0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                count++;
8                ans = Math.max(ans,count);
9            }
10            else{
11                // ans = Math.max(ans,count);
12                count =0;
13            }
14        }
15        return ans;
16        
17    }
18}