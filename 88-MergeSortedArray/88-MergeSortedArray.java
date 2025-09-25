// Last updated: 9/25/2025, 3:30:12 PM
class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
      
        for(int i=m;i<m+n;i++){
            nums1[i]= nums2[i%n];
        }
        Arrays.sort(nums1);
        return nums2;
        
    }
}