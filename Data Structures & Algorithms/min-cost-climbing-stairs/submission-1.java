class Solution {
    private int findCost(int[] cost, int i, int[] memo) {
        if (i >= cost.length) return 0;
        if (memo[i] != -1) return memo[i];
        return memo[i] = cost[i] + Math.min(findCost(cost, i + 1, memo), findCost(cost, i + 2, memo));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(findCost(cost, 0, memo), findCost(cost, 1, memo));
    }
}
