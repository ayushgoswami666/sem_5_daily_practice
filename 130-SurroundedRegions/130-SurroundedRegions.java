// Last updated: 2/13/2026, 11:13:26 PM
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5        // visited matrix to mark all 'O's connected to the boundary
6        boolean[][] vis = new boolean[m][n];
7
8        // 1. DFS from first/last columns
9        for(int i =0;i<m;i++){
10            if(board[i][0] == 'O' && vis[i][0] == false){
11                dfs(i,0,board,vis);
12            }
13            if(board[i][n-1] == 'O' && vis[i][n-1] == false){
14                dfs(i,n-1,board,vis);
15            }
16        }
17        // 2. DFS from first/last rows
18        for(int j = 0;j<n;j++){
19            if(board[0][j] == 'O' && vis[0][j] == false){
20                dfs(0,j,board,vis);
21            }
22            if(board[m-1][j] == 'O' && vis[m-1][j] == false){
23                dfs(m-1,j,board,vis);
24            }
25        }
26
27        // 3. Flip surrounded 'O's
28        for(int i =0;i<m;i++){
29            for(int j =0;j<n;j++){
30                // Flip 'O' if it's not marked as visited (i.e., not connected to border)
31                if(board[i][j] == 'O' && vis[i][j] == false){
32                    board[i][j] = 'X';
33                }
34            }
35        }
36    }
37    
38    public void dfs(int i, int j, char[][] board, boolean[][] vis){
39        int m = board.length;
40        int n = board[0].length;
41
42        // Base case: out of bounds, already visited, or 'X'
43        if(i<0 || j<0 || i>=m || j>=n || vis[i][j] == true || board[i][j] == 'X'){
44            return;
45        }
46        
47        vis[i][j] = true;
48
49        // DFS in all 4 directions
50        dfs(i+1,j,board,vis);
51        dfs(i,j+1,board,vis);
52        dfs(i-1,j,board,vis);
53        dfs(i,j-1,board,vis);
54    }
55}