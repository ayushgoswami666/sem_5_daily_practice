// Last updated: 4/10/2026, 11:57:09 PM
1class Solution {
2    int dirs[][] = {{0,-1},{0,1},{-1,0},{1,0}};
3    
4    public int swimInWater(int[][] grid) {
5        int n = grid.length;
6        int ans = Integer.MAX_VALUE;
7        int low = 0, high = n * n - 1;
8
9        while (low <= high) {
10            int mid = (low + high) / 2;
11            boolean vis[][] = new boolean[n][n];
12            if (grid[0][0] <= mid && dfs(0, 0, mid, grid, vis)) {
13                ans = mid;
14                high = mid - 1;
15            } else {
16                low = mid + 1;
17            }
18        }
19        return ans;
20    }
21
22    boolean dfs(int x, int y, int t, int[][] grid, boolean[][] vis) {
23        int n = grid.length;
24        vis[x][y] = true;
25        if (x == n - 1 && y == n - 1) return true;
26
27        for (int[] d : dirs) {
28            int nx = x + d[0], ny = y + d[1];
29            if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
30                !vis[nx][ny] && grid[nx][ny] <= t) {
31                if (dfs(nx, ny, t, grid, vis)) return true;
32            }
33        }
34        return false;
35    }
36}