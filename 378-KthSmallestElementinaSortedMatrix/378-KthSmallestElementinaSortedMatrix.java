// Last updated: 1/11/2026, 11:41:43 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4    
5        for(int[] row : matrix){
6            for(int i : row){
7                pq.add(i);
8            }
9        }
10        while(--k>0){
11            pq.poll();
12        }
13        return pq.poll();
14        
15    }
16}