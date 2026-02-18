// Last updated: 2/19/2026, 12:41:33 AM
1class Solution {
2    public long countPairs(int n, int[][] edges) {
3
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        for (int i = 0; i < n; i++) {
6            map.put(i, new ArrayList<>());
7        }
8
9        for (int[] e : edges) {
10            int u = e[0];
11            int v = e[1];
12            map.get(u).add(v);
13            map.get(v).add(u);
14        }
15
16        long ans = 0;
17        long remain = n;
18
19        Queue<Integer> q = new LinkedList<>();
20        HashSet<Integer> visited = new HashSet<>();
21
22        for (int i : map.keySet()) {
23
24            if (visited.contains(i)) continue;
25
26            long count = 0;
27            q.add(i);
28            visited.add(i);   // ✅ mark visited immediately
29
30            while (!q.isEmpty()) {
31                int r = q.poll();
32                count++;      // ✅ count when actually visiting
33
34                for (int nbr : map.get(r)) {
35                    if (!visited.contains(nbr)) {
36                        visited.add(nbr); // ✅ prevent multiple adds
37                        q.add(nbr);
38                    }
39                }
40            }
41
42            ans += count * (remain - count);
43            remain -= count;
44        }
45
46        return ans;
47    }
48}
49