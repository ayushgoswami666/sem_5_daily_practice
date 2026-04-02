// Last updated: 4/2/2026, 10:37:32 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int maxWeight = -1, totalWeight = 0;
4        for (int weight : weights) {
5            maxWeight = Math.max(maxWeight, weight);
6            totalWeight += weight;
7        }
8        int left = maxWeight, right = totalWeight;
9        while (left < right) {
10            int mid = (left + right) / 2;
11            int daysNeeded = 1, currWeight = 0;
12            for (int weight : weights) {
13                if (currWeight + weight > mid) {
14                    daysNeeded++;
15                    currWeight = 0;
16                }
17                currWeight += weight;
18            }
19            if (daysNeeded > days) {
20                left = mid + 1;
21            } else {
22                right = mid;
23            }
24        }
25        return left;
26    }
27}