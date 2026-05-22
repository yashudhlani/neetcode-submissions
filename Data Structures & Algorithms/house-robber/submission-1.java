class Solution {
    private int[] memo;
    private int dfs(int[] nums, int i) {
        if (i >= nums.length) return 0;

        if (memo[i] != -1) return memo[i];

        int robbed = nums[i] + dfs(nums, i + 2);
        int left = dfs(nums, i + 1);
        return memo[i] = Math.max(robbed, left);
    }

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dfs(nums, 0);
    }
}
