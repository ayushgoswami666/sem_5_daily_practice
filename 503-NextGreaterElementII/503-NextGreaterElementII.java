// Last updated: 10/30/2025, 12:33:30 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i =0;i<2*nums.length;i++){
            while(!st.isEmpty() && nums[i%nums.length]>nums[st.peek()]){
                ans[st.pop()]=nums[i%nums.length];
                
            }
            if(i<nums.length)st.push(i);
        }
        
        return ans;
        
    }
}