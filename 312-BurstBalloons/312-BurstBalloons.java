// Last updated: 9/23/2025, 10:27:45 PM
class Solution {
    public int maxCoins(int[] arr) {
        int n = arr.length;
        int[] a = new int[n + 2];
        a[0] = a[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            a[i + 1] = arr[i];
        }
        int[][] dp = new int[n + 2][n + 2];
        return Burst_Coin(a, 0, n + 1, dp);
    }

    public static int Burst_Coin(int[] a, int i, int j, int[][] dp) {
        if (i + 1 == j) return 0;
        if (dp[i][j] != 0) return dp[i][j];
        int ans = 0;
        for (int k = i + 1; k < j; k++) {
            int left = Burst_Coin(a, i, k, dp);
            int right = Burst_Coin(a, k, j, dp);
            int self = a[i] * a[k] * a[j];
            ans = Math.max(ans, left + right + self);
        }
        return dp[i][j] = ans;
    }
}
