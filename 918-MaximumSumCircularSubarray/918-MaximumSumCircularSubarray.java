// Last updated: 9/24/2025, 10:47:04 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return MaximumSum(nums);
    }
    public static int MaximumSum(int[]arr){
        int linearSum = kadens_algo(arr);
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            arr[i] = arr[i]*-1;
        }
        int mid = kadens_algo(arr);
        int circular_sum = sum +mid;
        if(circular_sum ==0){
            return linearSum;
        }
        return Math.max(circular_sum,linearSum);
        
    }
    public static int kadens_algo(int[]arr){
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
            sum=0;
        }
        }
        
        return ans;

    }
}