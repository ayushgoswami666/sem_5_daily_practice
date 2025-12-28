// Last updated: 12/28/2025, 8:45:24 AM
1class Solution {
2    public int minAllOneMultiple(int k) {
3        if(k%2==0 || k%5==0){
4            return -1;
5        }
6        int rem = 0;
7        boolean[] ans = new boolean[k];
8        for(int l = 1;l<=k;l++){
9            rem = (rem*10+1)%k;
10            if(rem == 0){
11                return l;
12            }
13            if(ans[rem]){
14                return -1;
15            }
16            ans[rem]=true;
17        }
18        return -1;
19        
20    }
21}