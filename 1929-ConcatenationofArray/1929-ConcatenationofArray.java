// Last updated: 12/26/2025, 10:29:18 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans = new int[2*n];
4        int l=0;
5        int j =n;
6        for(int i =0;i<2*n;i++){
7            if(i%2==0){
8                ans[i] = nums[l];
9                l+=1;
10            }
11            else{
12                ans[i] = nums[j];
13                j+=1;
14            }
15            
16        }
17        return ans;
18        
19    }
20}