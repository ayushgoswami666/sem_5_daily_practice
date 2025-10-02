// Last updated: 10/2/2025, 3:30:21 PM
class Solution {
    public int findDuplicate(int[] nums) {
        //hare and tortoise
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];
        //detecting cycle
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = nums[0];
        //finding the duplicate element
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;//fast
        
    }
}