class Solution {
    private int[][] memo;
    private int dfs(int[] nums, int i, boolean first) {
        if (!first && i >= nums.length) return 0;
        if (first && i >= nums.length - 1) return 0;
        if (memo[i][first ? 0 : 1] != -1) return memo[i][first ? 0 : 1];
    
        return memo[i][first ? 0 : 1] = Math.max(nums[i] + dfs(nums, i + 2, first), dfs(nums, i + 1, first));
    }
    public int rob(int[] nums) { 
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);  
        memo = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        return Math.max(dfs(nums, 0, true), dfs(nums, 1, false));
    }
}
