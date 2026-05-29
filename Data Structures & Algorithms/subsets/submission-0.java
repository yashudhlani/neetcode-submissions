class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    private void dfs (int[] nums, int i, List<Integer> curr) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        dfs(nums, i + 1, curr);

        curr.add(nums[i]);
        dfs(nums, i + 1, curr);
        curr.remove(curr.size() - 1);
    } 

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();

        dfs(nums, 0, curr);
        return ans;
    }
}
