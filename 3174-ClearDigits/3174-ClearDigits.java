// Last updated: 1/17/2026, 5:37:30 PM
1class Solution {
2    public String clearDigits(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i =0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(!Character.isDigit(ch)){
7                sb.append(ch);
8            }
9            else{
10                sb.deleteCharAt(sb.length()-1);
11
12            }
13        }
14        return sb.toString();
15        
16    }
17}