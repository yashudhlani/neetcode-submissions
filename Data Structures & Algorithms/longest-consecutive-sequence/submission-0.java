class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }
        int longest = 0;
        for (int x: set) {
            int l = x;
            while (set.contains(l+1)) {
                l = l+1;
            }
            longest = Math.max(longest, l - x + 1);
        }
        return longest;
    }
}
