// Last updated: 12/26/2025, 11:26:22 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp = new int[word1.length()][word2.length()];
4        return editdistance(word1,word2,0,0,dp);
5        
6    }
7    public  static int editdistance(String s,String t,int i ,int j,int[][] dp ){
8        if(i==s.length()){
9            return t.length()-j;
10        }
11        if(j==t.length()){
12            return s.length()-i;
13        }
14        if(dp[i][j]!=0){
15            return dp[i][j];
16        }
17        int ans =0;
18        if(s.charAt(i)==t.charAt(j)){
19            ans = editdistance(s,t,i+1,j+1,dp);
20        }
21        else{
22            int d = editdistance(s,t,i+1,j,dp);
23            int I = editdistance(s,t,i,j+1,dp);
24            int R = editdistance(s,t,i+1,j+1,dp);
25            ans = 1+Math.min(R,Math.min(d,I)); 
26        }
27        return dp[i][j]= ans;
28    }
29}