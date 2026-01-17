// Last updated: 1/17/2026, 9:08:22 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        Set<Integer> set = new HashSet<>();
4        for(int i= 0;i<nums.length;i++){
5
6            if(nums[i] != target[i]){
7                set.add(nums[i]);
8            }
9            
10        }
11        return set.size();
12        
13    }
14}