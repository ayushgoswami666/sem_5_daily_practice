// Last updated: 3/21/2026, 11:29:06 PM
1class Solution {
2    public int countSquares(int[][] A) {
3        if (A == null || A.length == 0 || A[0].length == 0) {
4            return 0;
5        }
6
7        int m = A.length;
8        int n = A[0].length;
9        int res = 0;
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                if (A[i][j] == 1 && i > 0 && j > 0) {
14                    A[i][j] = Math.min(
15                        A[i - 1][j - 1],
16                        Math.min(A[i - 1][j], A[i][j - 1])
17                    ) + 1;
18                }
19                res += A[i][j];
20            }
21        }
22
23        return res;
24    }
25}