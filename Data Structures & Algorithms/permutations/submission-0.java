class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    boolean[] seen;

    private void backtrack(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!seen[i]) {
                temp.add(nums[i]);
                seen[i] = true;
                backtrack(nums, temp);
                temp.remove(temp.size() - 1);
                seen[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        seen = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
        return ans;
    }
}
