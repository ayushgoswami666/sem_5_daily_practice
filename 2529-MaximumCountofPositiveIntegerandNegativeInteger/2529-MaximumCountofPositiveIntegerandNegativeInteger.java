// Last updated: 3/28/2026, 11:08:10 PM
1class Solution {
2    public int maximumCount(int[] nums) {
3
4        int neg = negCount(nums);
5        int pos = posCount(nums);
6
7        return Math.max(neg, pos);
8    }
9
10    public static int negCount(int[] nums) {
11
12        int start = 0;
13        int end = nums.length - 1;
14        int lastNeg = -1;
15
16        while (start <= end) {
17
18            int mid = (start + end) / 2;
19
20            if (nums[mid] < 0) {
21                lastNeg = mid;
22                start = mid + 1;
23            } else {
24                end = mid - 1;
25            }
26        }
27
28        return lastNeg + 1;
29    }
30
31    public static int posCount(int[] nums) {
32
33        int start = 0;
34        int end = nums.length - 1;
35        int firstPos = nums.length;
36
37        while (start <= end) {
38
39            int mid = (start + end) / 2;
40
41            if (nums[mid] > 0) {
42                firstPos = mid;
43                end = mid - 1;
44            } else {
45                start = mid + 1;
46            }
47        }
48
49        return nums.length - firstPos;
50    }
51}