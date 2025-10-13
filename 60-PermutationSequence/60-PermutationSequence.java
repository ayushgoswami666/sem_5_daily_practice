// Last updated: 10/13/2025, 11:47:50 PM
class Solution {
    static int count = 0;
    static String answer = "";

    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n];
        count = 0;
        answer = "";
        generate(used, n, "", k);
        return answer;
    }

    public static void generate(boolean[] used, int n, String current, int k) {
        if (answer.length() > 0) return; // stop if answer found

        if (current.length() == n) {
            count++;
            if (count == k) answer = current;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                generate(used, n, current + (i + 1), k);
                used[i] = false;
            }
        }
    }
}
