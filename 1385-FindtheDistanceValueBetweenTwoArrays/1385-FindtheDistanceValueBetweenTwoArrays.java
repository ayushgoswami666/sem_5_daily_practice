// Last updated: 3/29/2026, 11:14:42 PM
1class Solution {
2
3    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
4        Arrays.sort(arr2);    
5        int distance = 0;
6        
7        for (int val : arr1) {
8            if (notInRange(arr2, val - d, val + d)) {
9                distance++;
10            }
11        }    
12        
13        return distance;
14    }
15    
16    // Checks if the array doesn't contain any value in range (from <= value <= to) using binary search
17    private static boolean notInRange(int[] arr, int from, int to) {
18        int start = 0;
19        int end = arr.length - 1;
20        
21        while (start <= end) {
22            int mid = start + (end - start) / 2;
23            if (arr[mid] >= from && arr[mid] <= to) {
24                return false;
25            } else if (arr[mid] < from) {
26                start = mid + 1;
27            } else {
28                end = mid - 1;
29            }
30        }
31        
32        return true;
33    }
34}