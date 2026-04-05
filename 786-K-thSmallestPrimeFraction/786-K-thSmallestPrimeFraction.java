// Last updated: 4/5/2026, 11:19:30 PM
1class Solution {
2    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
3        int n = arr.length;
4        double left = 0, right = 1, mid;
5        int[] res = new int[2];
6
7        while (left <= right) {
8            mid = left + (right - left) / 2;
9            int j = 1, total = 0, num = 0, den = 0;
10            double maxFrac = 0;
11            for (int i = 0; i < n; ++i) {
12                while (j < n && arr[i] >= arr[j] * mid) {
13                    ++j;
14                }
15                
16                total += n - j;
17
18                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
19                    maxFrac = arr[i] * 1.0 / arr[j];
20                    num = i;
21                    den = j;
22                }
23            }
24
25            if (total == k) {
26                res[0] = arr[num];
27                res[1] = arr[den];
28                break;
29            }
30
31            if (total > k) {
32                right = mid;
33            } else {
34                left = mid;
35            }
36        }
37
38        return res;
39    }
40}