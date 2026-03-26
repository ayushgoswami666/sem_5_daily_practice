// Last updated: 3/26/2026, 4:53:45 PM
1class Solution {
2     
3    public int[] kWeakestRows(int[][] mat, int k) {
4    int rows = mat.length;
5    int cols = mat[0].length;
6
7    int[] score = new int[rows];
8    int j;
9    for (int i = 0; i < rows; i++) {
10        j = 0;
11        for (; j < cols; j++) {
12            if (mat[i][j] == 0) {
13                break;
14            }
15        }
16		/*
17		 * we can create a score to match the sort condition from description
18		 * score = soldiersCount * rows + currentRowIndex
19		 * so we can get soldiersCount by score / rows, and get rowIndex by score % rows
20		 */
21        score[i] = j * rows + i;
22    }
23
24    Arrays.sort(score);
25    for (int i = 0; i < score.length; i++) {
26		// get rowIndex
27        score[i] = score[i] % rows;
28    }
29
30    return Arrays.copyOfRange(score, 0, k);
31}
32}