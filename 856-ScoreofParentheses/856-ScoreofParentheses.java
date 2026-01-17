// Last updated: 1/17/2026, 5:21:25 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int n = s.length(), d = 0, R = 0;
4        
5        for(int i=0;i<n;i++) {
6            char ch = s.charAt(i);
7            // if `(` increase the depth
8            if(ch == '(')
9                d++;
10            else {
11            // if `)` decrease the depth
12                --d;
13                // check if a balanced pair is getting formed, if yes update the result
14                if(s.charAt(i-1) == '(')
15                    R += Math.pow(2, d);
16            }
17        }
18        return R;
19    }
20}