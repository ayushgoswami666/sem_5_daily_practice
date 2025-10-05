// Last updated: 10/5/2025, 10:32:26 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int min = nums[0];
        for(int i =1;i<nums.length;i++){
            int n = nums[i];
            while(!st.isEmpty() && n>=st.peek()[0]){
                st.pop();
            }
            if(!st.isEmpty() && n>st.peek()[1]){
                return true;
            }
            st.push(new int[]{n,min});
            min = Math.min(n,min);
        }
        return false;
        
    }
}