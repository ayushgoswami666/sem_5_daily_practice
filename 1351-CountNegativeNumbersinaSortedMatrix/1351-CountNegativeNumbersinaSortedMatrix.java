// Last updated: 3/25/2026, 11:52:44 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3         int rows = grid.length;
4        int cols = grid[0].length;
5        int row = 0; 
6        int col = grid[0].length-1;
7        int count = 0;
8        while(row < rows && col >= 0){
9            if(grid[row][col] >= 0){
10                row++;
11            } else {
12                count += rows-row;
13                col--;
14            }
15        }
16        return count;
17        
18    }
19}