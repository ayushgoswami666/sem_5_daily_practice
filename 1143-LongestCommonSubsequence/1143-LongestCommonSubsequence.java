// Last updated: 12/26/2025, 10:15:43 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()][text2.length()];
4        for(int[] row : dp){
5            Arrays.fill(row,-1);
6        }
7        return lcs(text1,text2,0,0,dp);
8
9        
10    }
11    public static int lcs(String s1,String s2,int i,int j,int[][] dp){
12        if(s1.length()==i || s2.length()==j){
13            return 0;
14        }
15        if(dp[i][j]!=-1){
16            return dp[i][j];
17        }
18        int ans = 0;
19        if(s1.charAt(i)==s2.charAt(j)){
20            ans = 1+lcs(s1,s2,i+1,j+1,dp);
21        }
22        else{
23            int f = lcs(s1,s2,i+1,j,dp);
24            int s = lcs(s1,s2,i,j+1,dp);
25            ans = Math.max(f,s);
26        }
27        return dp[i][j] = ans;
28    }
29}