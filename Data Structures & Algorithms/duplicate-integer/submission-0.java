class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();

        for (int x: nums) {
            if (!dup.add(x)) {
                return true;
            }
        }
        return false;
    }
}