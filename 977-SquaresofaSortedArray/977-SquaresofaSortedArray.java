// Last updated: 9/30/2025, 3:25:16 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}