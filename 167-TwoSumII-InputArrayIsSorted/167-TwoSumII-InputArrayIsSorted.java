// Last updated: 10/1/2025, 6:56:50 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int sum = nums[low]+nums[high];
            if(sum>target){
                high--;
                
            }
            else if(sum<target){
                low++;

            }
            else{
                arr[0] = low+1;
                arr[1] = high+1;
                low++;
                high--;
            }
        }
        return arr;
        
    }
}