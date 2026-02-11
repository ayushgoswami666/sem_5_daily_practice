// Last updated: 2/11/2026, 11:28:05 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3
4        int old_color = image[sr][sc];
5        if (old_color == color) return image; 
6
7        int n = image.length;
8        int m = image[0].length;
9
10        Queue<int[]> q = new LinkedList<>();
11        int[] dr = {-1, 1, 0, 0};
12        int[] dc = {0, 0, -1, 1};
13
14        q.add(new int[]{sr, sc});
15        image[sr][sc] = color;
16
17        while (!q.isEmpty()) {
18            int[] rv = q.poll();
19            int r = rv[0];
20            int c = rv[1];
21
22            for (int i = 0; i < 4; i++) {
23                int cr = r + dr[i];
24                int cc = c + dc[i];
25
26                if (cr >= 0 && cc >= 0 && cr < n && cc < m
27                        && image[cr][cc] == old_color) {
28
29                    image[cr][cc] = color;
30                    q.add(new int[]{cr, cc});
31                }
32            }
33        }
34        return image;
35    }
36}
37