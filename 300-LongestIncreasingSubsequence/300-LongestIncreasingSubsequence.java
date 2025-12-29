// Last updated: 12/29/2025, 10:07:49 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] dp = new int[nums.length];
4        dp[0]  = nums[0];
5        int len = 1;
6        for(int i =1;i<nums.length;i++){
7            if(nums[i]>dp[len-1]){
8                dp[len] = nums[i];
9                len++;
10            }
11            else{
12                int idx = binarySearch(dp,0,len-1,nums[i]);
13                dp[idx] = nums[i];
14            }
15        }
16        return len;
17        
18    }
19    public static int binarySearch(int[] arr,int si,int ei,int item){
20        int idx = 0;
21        while(si<=ei){
22            int mid = (si+ei)/2;
23            if(arr[mid]>=item){
24                idx = mid;
25                ei = mid-1;
26            }
27            else{
28                si = mid+1;
29            }
30
31        }
32        return idx;
33    }
34}