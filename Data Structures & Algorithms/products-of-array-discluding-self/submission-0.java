class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = 1;
        int r = 1;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            left[i] = l;
            right[nums.length - 1 - i] = r;
            l = l * nums[i];
            r = r * nums[nums.length - 1 - i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}  
