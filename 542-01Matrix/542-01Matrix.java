// Last updated: 2/12/2026, 3:06:19 PM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int n = mat.length;
4        int m = mat[0].length;
5        int[] dr = {-1,1,0,0};
6        int[] dc = {0,0,-1,1};
7        Queue<int[]> q = new LinkedList<>();
8        for(int i =0;i<n;i++){
9            for(int j =0;j<m;j++){
10                if(mat[i][j]==0){
11                    q.add(new int[]{i,j});
12                }
13                else{
14                    mat[i][j] =-1;
15                }
16            }
17        }
18
19        while(!q.isEmpty()){
20          
21                int[] rv = q.poll();
22                int r = rv[0];
23                int c = rv[1];
24
25                for(int j =0;j<4;j++){
26                    int nr = r+dr[j];
27                    int nc = c +dc[j];
28
29                    if(nr>=0 && nc>=0 && nr<n && nc<m && mat[nr][nc]==-1){
30                        mat[nr][nc]=mat[r][c]+1;
31                        q.add(new int[]{nr,nc});
32                    }
33                    
34                
35            }
36
37        }
38        return mat;
39        
40    }
41}