// Last updated: 12/26/2025, 10:53:31 AM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int [][] dp= new int[nums1.length + 1][nums2.length +1];
4        for(int i = 1;i<dp.length;i++){
5            for(int j = 1;j<dp[0].length;j++){
6                if(nums1[i-1] == nums2[j-1]){
7                    dp[i][j] = 1 + dp[i-1][j-1];
8                  }
9                    else{
10                    int f = dp[i-1][j];
11                    int s = dp[i][j-1];
12                    dp[i][j] = Math.max(f,s);
13                   }
14                     
15
16            }
17            
18        }
19        return dp[dp.length -1][dp[0].length -1];
20        
21    }
22}