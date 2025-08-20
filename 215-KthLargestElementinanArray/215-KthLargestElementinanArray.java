// Last updated: 8/20/2025, 12:03:23 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
       return Max(nums,k); 
    }
    public static int Max(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
         return arr[n-(k)];


    }
}