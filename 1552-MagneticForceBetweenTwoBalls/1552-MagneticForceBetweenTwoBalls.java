// Last updated: 3/31/2026, 10:52:17 PM
1class Solution {
2 public int maxDistance(int[] arr, int m) {
3
4     int n = arr.length;
5     Arrays.sort(arr);
6
7     int lo = 1;
8     int hi = arr[n - 1] - arr[0];
9     int ans = 0;
10
11     while (lo <= hi) {
12
13         int mid = (lo + hi) / 2;
14
15         if (isvalid(mid, m, arr)) {
16             ans = mid;
17             lo = mid + 1;
18         } else {
19             hi = mid - 1;
20         }
21     }
22
23     return ans;
24 }
25
26 public boolean isvalid(int mid, int m, int[] pos) {
27
28     int firstball = pos[0];
29     int count = 1;
30
31     for (int i = 1; i < pos.length; i++) {
32
33         if (pos[i] - firstball >= mid) {
34             firstball = pos[i];
35             count++;
36         }
37
38         if (count >= m) {
39             return true;
40         }
41     }
42
43     return false;
44 }
45}