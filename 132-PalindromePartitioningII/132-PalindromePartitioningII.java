// Last updated: 1/2/2026, 11:11:43 PM
1class Solution {
2    public int minCut(String s) {
3        int[] dp = new int[s.length()];
4        return solve(s,0,dp);
5    }
6    public static int solve(String s, int start,int[] dp){
7        if(ispalindrome(s.substring(start))){
8            return 0;
9        }
10        if(dp[start]!=0){
11            return dp[start];
12
13        }
14        int min = Integer.MAX_VALUE;
15
16        for (int cut = start; cut < s.length(); cut++) {
17            String left = s.substring(start, cut + 1);
18
19            if (ispalindrome(left)) {
20                int rightCuts = solve(s, cut + 1, dp);
21                min = Math.min(min, 1 + rightCuts);
22            }
23        }
24
25        return dp[start] = min;
26
27    }
28     public static boolean ispalindrome(String str){
29        int left =0;
30        int right = str.length()-1;
31        while(left<right){
32            if(str.charAt(left)!=str.charAt(right)){
33                return false;
34            }
35            left++;
36            right--;
37        }
38        return true;
39
40    }
41}