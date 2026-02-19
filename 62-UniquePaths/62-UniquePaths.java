// Last updated: 2/19/2026, 11:43:30 PM
1class Solution {
2    public String convert(String s, int numRows) {
3       if (numRows == 1 || numRows >= s.length()) {
4            return s;
5        }
6
7        int idx = 0, d = 1;
8        List<Character>[] rows = new ArrayList[numRows];
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new ArrayList<>();
11        }
12
13        for (char c : s.toCharArray()) {
14            rows[idx].add(c);
15            if (idx == 0) {
16                d = 1;
17            } else if (idx == numRows - 1) {
18                d = -1;
19            }
20            idx += d;
21        }
22
23        StringBuilder result = new StringBuilder();
24        for (List<Character> row : rows) {
25            for (char c : row) {
26                result.append(c);
27            }
28        }
29
30        return result.toString();        
31    }
32}