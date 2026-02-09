// Last updated: 2/9/2026, 11:49:57 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    // Map to store results of subproblems: "s1+s2" -> Boolean
6    private Map<String, Boolean> memo = new HashMap<>();
7
8    public boolean isScramble(String s1, String s2) {
9        int n = s1.length();
10        
11        // 1. Base Case: If strings are identical
12        if (s1.equals(s2)) return true;
13        
14        // 2. Check Memoization
15        String key = s1 + " " + s2;
16        if (memo.containsKey(key)) return memo.get(key);
17        
18        // 3. Pruning: If they aren't anagrams, they can't be scrambles
19        if (!isAnagram(s1, s2)) {
20            memo.put(key, false);
21            return false;
22        }
23
24        // 4. Recursive Splitting
25        for (int i = 1; i < n; i++) {
26            // Case 1: No Swap
27            // Split s1 into [0,i] and [i,n], compare with s2 split at same index
28            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && 
29                isScramble(s1.substring(i), s2.substring(i))) {
30                memo.put(key, true);
31                return true;
32            }
33
34            // Case 2: Swap
35            // Split s1 into [0,i] and [i,n], compare with s2's mirrored parts
36            if (isScramble(s1.substring(0, i), s2.substring(n - i)) && 
37                isScramble(s1.substring(i), s2.substring(0, n - i))) {
38                memo.put(key, true);
39                return true;
40            }
41        }
42
43        memo.put(key, false);
44        return false;
45    }
46
47    private boolean isAnagram(String s1, String s2) {
48        if (s1.length() != s2.length()) return false;
49        int[] count = new int[26];
50        for (int i = 0; i < s1.length(); i++) {
51            count[s1.charAt(i) - 'a']++;
52            count[s2.charAt(i) - 'a']--;
53        }
54        for (int c : count) {
55            if (c != 0) return false;
56        }
57        return true;
58    }
59}