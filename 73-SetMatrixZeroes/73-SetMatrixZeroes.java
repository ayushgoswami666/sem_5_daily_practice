// Last updated: 1/27/2026, 11:30:55 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int[] row = new int[matrix.length];
4        int[] col = new int[matrix[0].length];
5        for(int i=0;i<matrix.length;i++){
6            for(int j =0;j<matrix[0].length;j++){
7                if(matrix[i][j]==0){
8                    row[i] =1;
9                    col[j] = 1;
10
11                }
12            }
13        }
14        for(int i=0;i<matrix.length;i++){
15            for(int j =0;j<matrix[0].length;j++){
16                if(row[i]==1 || col[j]==1){
17                    matrix[i][j]=0;
18                    
19                }
20            }
21        }
22        
23    }
24    
25}