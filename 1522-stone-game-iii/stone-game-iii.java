class Solution {
    public String stoneGameIII(int[] a) {
        int n = a.length;
        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int sum = 0;
            dp[i] = Integer.MIN_VALUE;

            for (int j = 0; j < 3 && i + j < n; j++) {
                sum += a[i + j];
                dp[i] = Math.max(dp[i], sum - dp[i + j + 1]);
            }
        }

        return dp[0] > 0 ? "Alice" : dp[0] < 0 ? "Bob" : "Tie";
    }
}