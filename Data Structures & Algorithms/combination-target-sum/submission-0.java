class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    private void dfs(int[] nums, int target, List<Integer> curr, int i) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
        }

        for (int j = i; j < nums.length; j++) {
            if (target - nums[j] >= 0) {
                curr.add(nums[j]);
                dfs(nums, target - nums[j], curr, j);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        dfs(nums, target, curr, 0);
        return ans;
    }
}
