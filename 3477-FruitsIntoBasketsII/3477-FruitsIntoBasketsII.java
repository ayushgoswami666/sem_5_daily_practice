// Last updated: 4/6/2026, 10:43:44 PM
1class Solution {
2    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
3        int n = fruits.length;
4        int count = 0;
5        for(int i=0; i<n; i++){
6
7            // get the first basket with enough capacity
8            int j = 0;
9            while(j<n && baskets[j]<fruits[i]){
10                j++;
11            }
12            // place fruits there and mark it as unavailable for other
13            if(j<n && baskets[j]>=fruits[i]){
14                baskets[j] = -1;
15                count++; // count placed fruits
16            }
17        }
18        return n-count; // unplacef fruits
19    }
20}
21