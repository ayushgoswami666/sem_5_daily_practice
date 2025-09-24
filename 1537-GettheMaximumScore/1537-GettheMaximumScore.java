// Last updated: 9/24/2025, 11:24:30 PM
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int s1 = 0;
        int s2 = 0;
        long ans = 0;
        int MOD = 1_000_000_007;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                long sum1 = 0;
                for (int k = s1; k < i; k++) {
                    sum1 += nums1[k];
                }
                long sum2 = 0;
                for (int k = s2; k < j; k++) {
                    sum2 += nums2[k];   
                }
                ans = ans + Math.max(sum1, sum2) + nums1[i];
                s1 = i + 1;  
                s2 = j + 1;
                i++;
                j++;
            }
        }

        long sum1 = 0;
        for (int k = s1; k < nums1.length; k++) {
            sum1 += nums1[k];
        }
        long sum2 = 0;
        for (int k = s2; k < nums2.length; k++) {
            sum2 += nums2[k];
        }
        ans = ans + Math.max(sum1, sum2);

        return (int)(ans % MOD);
    }
}
