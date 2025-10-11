// Last updated: 10/11/2025, 10:19:01 PM
class Solution {
    public int lastRemaining(int n) {
        return helper(n, true);
    }

    private int helper(int n, boolean left) {
        // Base case
        if (n == 1) return 1;

        // Recursive relation:
        // If eliminating from left, or count of numbers is odd,
        // head shifts by step (which doubles each time)
        if (left || n % 2 == 1) {
            return 2 * helper(n / 2, !left);
        } else {
            return 2 * helper(n / 2, !left) - 1;
        }
    }
}
