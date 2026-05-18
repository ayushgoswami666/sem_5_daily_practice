// Last updated: 5/18/2026, 4:18:23 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()+1][text2.length()+1];
4        for(int[] a:dp){
5            Arrays.fill(a,-1);
6        }
7        return lcs(text1,text2,0,0,dp);
8        
9    }
10    public static int lcs(String s1,String s2,int i,int j,int[][]dp){
11        if(s1.length()==i || s2.length()==j){
12            return 0;   
13        }
14        if(dp[i][j]!=-1){
15            return dp[i][j];
16        }
17        int ans;
18        if(s1.charAt(i)==s2.charAt(j)){
19            ans = 1+lcs(s1,s2,i+1,j+1,dp);
20
21        }
22        else{
23            int f = lcs(s1,s2,i+1,j,dp);
24            int s = lcs(s1,s2,i,j+1,dp);
25            ans = Math.max(f,s);
26        }
27        return dp[i][j] = ans;
28
29    }
30}