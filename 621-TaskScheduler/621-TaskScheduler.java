// Last updated: 2/3/2026, 10:13:41 PM
1import java.util.*;
2
3class Solution {
4    public int leastInterval(char[] tasks, int n) {
5        // Step 1: Count task frequencies
6        int[] freq = new int[26];
7        for (char ch : tasks) {
8            freq[ch - 'A']++;
9        }
10
11        // Step 2: Max-Heap for task frequencies
12        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
13        for (int i = 0; i < 26; ++i) {
14            if (freq[i] > 0) {
15                pq.add(freq[i]);
16            }
17        }
18
19        // Step 3: Simulate scheduling cycles
20        int time = 0;
21        while (!pq.isEmpty()) {
22            ArrayList<Integer> ls = new ArrayList<>();
23            int task = 0;
24            int cycle = n + 1; // Each cycle consists of n + 1 slots
25
26            // Fill the current cycle
27            while (cycle-- > 0 && !pq.isEmpty()) {
28                int cur = pq.poll();
29                if (cur > 1) {
30                    ls.add(cur - 1); // Decrement frequency if the task still needs to be executed
31                }
32                task++;
33            }
34
35            // Re-add remaining tasks to the heap
36            for (int i : ls) {
37                pq.add(i);
38            }
39
40            // Increment time
41            time += (pq.isEmpty()) ? task : n + 1; // If heap is empty, add only the executed tasks; else, a full cycle
42        }
43
44        return time;
45    }
46}