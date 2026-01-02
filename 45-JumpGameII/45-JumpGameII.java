// Last updated: 1/2/2026, 9:30:22 AM
1class Solution {
2    public int jump(int[] nums) {
3        int step =0,currend=0,maxjump=0;
4        for(int i=0;i<nums.length-1;i++){
5            maxjump = Math.max(maxjump,i+nums[i]);
6            if(i==currend){
7                step++;
8                currend = maxjump;
9            }
10
11        }
12        return step;
13        
14    }
15}