class Solution {
    // [1, 2] 3
    private int findCoins(int[] coins, int amount, int[] memo) {
        if (amount == 0) return 0;
        int ans = Integer.MAX_VALUE;
        if (memo[amount] != -2) return memo[amount];
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                int min = findCoins(coins, amount - coins[i], memo);
                if (min != -1) {
                    ans = Math.min(ans, 1 + min);
                }
            }
        }
        memo[amount] = ans == Integer.MAX_VALUE ? -1 : ans;
        return memo[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2);
        return findCoins(coins, amount, memo);
    }
}
