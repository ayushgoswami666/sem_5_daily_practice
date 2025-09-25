// Last updated: 9/25/2025, 3:09:12 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                l1.add(i);
            }
        }
        return l1;
        
    }
}