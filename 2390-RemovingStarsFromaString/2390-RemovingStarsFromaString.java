// Last updated: 1/17/2026, 5:01:13 PM
1class Solution {
2    public String removeStars(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i =0;i<s.length();i++){
5            if(s.charAt(i)!='*'){
6                sb.append(s.charAt(i));
7            }
8            else{
9                sb.deleteCharAt(sb.length()-1);
10
11            }
12        }
13        return sb.toString();
14
15        
16    }
17}