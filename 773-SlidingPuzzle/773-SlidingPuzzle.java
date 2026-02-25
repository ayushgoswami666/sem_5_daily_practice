// Last updated: 2/25/2026, 11:47:31 PM
1class Solution {
2    public int slidingPuzzle(int[][] board) {
3        // Directions for possible swaps based on '0' position
4        int[][] dir = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};
5        String target = "123450";
6        Set<String> vis = new HashSet<>(); // Track visited configurations
7        Queue<String> q = new LinkedList<>();
8        String start = "";
9
10        // Convert 2D board to a single string
11        for (int[] row : board) {
12            for (int col : row) {
13                start += col;
14            }
15        }
16
17        q.offer(start);
18        vis.add(start);
19        int step = 0;
20
21        // Perform BFS
22        while (!q.isEmpty()) {
23            int size = q.size();
24            while (size-- > 0) {
25                String current = q.poll();
26
27                // Check if target is reached
28                if (current.equals(target)) return step;
29
30                int zero = current.indexOf('0'); // Find position of '0'
31
32                // Generate next moves
33                for (int move : dir[zero]) {
34                    StringBuilder next = new StringBuilder(current);
35                    char temp = next.charAt(zero);
36                    next.setCharAt(zero, next.charAt(move));
37                    next.setCharAt(move, temp);
38
39                    if (!vis.contains(next.toString())) { // Add unvisited states to the queue
40                        vis.add(next.toString());
41                        q.offer(next.toString());
42                    }
43                }
44            }
45            step++;
46        }
47        return -1; // Return -1 if target is unreachable
48    }
49}