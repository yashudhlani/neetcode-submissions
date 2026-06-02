class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < s.length(); i++) {
            dp[i] = s.charAt(i) == '0' ? 0 : dp[i - 1];
            if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) < '7')) {
                dp[i] = dp[i] + (i > 1 ? dp[i - 2] : 1);
            }
        }
        return dp[s.length() - 1];
    }
}
