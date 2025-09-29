// Last updated: 9/29/2025, 8:47:51 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i =0;i<nums.length-1;i++){
        
            if(nums[i]== nums[i+1]){
                return true;

            }
        
    }
    return false;
        
    }
}