// Last updated: 10/2/2025, 5:25:42 PM
class Solution {
    public int[] moveZeroes(int[] nums) {
        int low = 0;
        //sifting non zeroes 
        for(int h =0;h<nums.length;h++){
            if(nums[h]!=0){
                int temp =nums[h];
                nums[h] = nums[low];
                nums[low] = temp;
                low++;
            }
        }

        return nums;
        
    }
}