// Last updated: 12/26/2025, 10:41:22 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        return lcsBU(text1,text2);
4        
5    }
6    public static int lcsBU(String s1,String s2){
7        int[][] dp = new int[s1.length()+1][s2.length()+1];
8        // to handel the blank string
9        for(int i =1;i<dp.length;i++){
10            for(int j = 1;j<dp[0].length;j++){
11                if(s1.charAt(i-1)==s2.charAt(j-1)){
12                    dp[i][j] = 1+dp[i-1][j-1];
13                }
14                else{
15                    int f = dp[i][j-1];
16                    int s = dp[i-1][j];
17                    dp[i][j] = Math.max(f,s);
18                }
19            }
20        }
21        return dp[dp.length-1][dp[0].length-1];
22    }
23}