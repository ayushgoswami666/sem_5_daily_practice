// Last updated: 2/7/2026, 4:15:40 PM
1class Solution {
2    public int minimumDeletions(String s) {
3        int count = 0;
4        int ans = 0;
5        for(int i =0;i<s.length();i++){
6            if(s.charAt(i)=='b'){
7                count++;
8            }
9            if(s.charAt(i)=='a' && count >0){
10                count--;
11                ans++;
12            }
13        }
14        return ans;
15
16        
17    }
18}