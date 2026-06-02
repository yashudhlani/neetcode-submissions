class Solution {
    private int findCount(String s, int i, int[] memo) {
        if (i >= s.length()) return 1;
        if (s.charAt(i) == '0') return 0;
        if (memo[i] != -1) return memo[i];
        int ans = findCount(s, i + 1, memo);
        if (i < s.length() - 1) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                ans += findCount(s, i + 2, memo);
            }
        }
        return memo[i] = ans;
    }
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return findCount(s, 0, memo);   
    }
}
