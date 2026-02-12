// Last updated: 2/12/2026, 12:21:04 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int total = 0;
4        int roten = 0;
5        int n = grid.length;
6        int m = grid[0].length;
7        int time =0;
8        int[] dr = {-1,1,0,0};
9        int[] dc = {0,0,-1,1};
10        
11        Queue<int[]> q = new LinkedList<>();
12        for(int i =0;i<n;i++){
13            for(int j =0;j<m;j++){
14                if(grid[i][j]==2){
15                    q.add(new int[]{i,j});
16                    roten+=1;
17                    total+=1;
18                }
19                if(grid[i][j]==1){
20                    total +=1;
21                }
22            }
23        }
24        while(!q.isEmpty()){
25            boolean t = false;
26            int size = q.size();
27
28
29            for(int j =0;j<size;j++){
30            int[] rv = q.poll();
31            int r = rv[0];
32            int c = rv[1];
33            
34            for(int i =0;i<4;i++){
35               int nr = r + dr[i];
36                int nc = c + dc[i];
37
38                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
39                    grid[nr][nc] = 2;
40                    q.add(new int[]{nr,nc});
41                    t = true;
42                    roten+=1;
43                    
44                }
45            }
46            }
47            if(t){
48                time++;          
49                  }
50
51
52        }
53        if(total != roten){
54            return -1;
55        }
56
57        return time;
58
59        
60    }
61}