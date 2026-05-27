class Solution {
    private int helper(int[] nums) {
        int a = 0;
        int b = 0;

        for (int num: nums) {
            int temp = b;
            b = Math.max(a + num, b);
            a = temp;
        }
        return b;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)), helper(Arrays.copyOfRange(nums, 0, nums.length - 1)));
    }
}
