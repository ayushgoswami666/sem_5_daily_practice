// Last updated: 2/8/2026, 9:58:32 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int c = 1;
4        // for(int i =0;i<nums.length-1;i++){
5            for(int j =1;j<nums.length;j++){
6                if(nums[c-1]!=nums[j]){
7                    nums[c] = nums[j] ;
8                    c++;
9                    
10
11                }
12            
13        }
14        return c;
15        
16    }
17}