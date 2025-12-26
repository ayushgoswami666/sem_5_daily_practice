// Last updated: 12/26/2025, 5:47:47 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int[][] dp = new int[s.length()][t.length()];
4        for(int[] row : dp){
5            Arrays.fill(row,-1);
6        }
7        return subseq(s,t,0,0,dp);
8        
9    }
10    public static int  subseq(String s,String t,int i,int j,int[][] dp){
11        if(j==t.length()){
12            return 1;
13        }
14        if(i==s.length()){
15            return 0;
16        }
17        if(dp[i][j]!=-1){
18            return dp[i][j];
19        }
20        int inc =0,exc=0;
21        if(s.charAt(i)==t.charAt(j)){
22             inc = subseq(s,t,i+1,j+1,dp);
23        }
24          exc = subseq(s,t,i+1,j,dp);
25        return dp[i][j] = inc + exc;
26    }
27}