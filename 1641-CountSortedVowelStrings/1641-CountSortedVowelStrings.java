// Last updated: 3/23/2026, 11:14:47 PM
1class Solution {
2    public int countVowelStrings(int n) {
3        int a = 1, e = 1, i = 1, o = 1, u = 1;
4
5        while (--n > 0) {
6            o += u;
7            i += o;
8            e += i;
9            a += e;
10        }
11
12        return a + e + i + o + u;
13    }
14}