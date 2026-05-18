class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] have = new int[26];
        for (char s: s1.toCharArray()) {
            need[s - 'a']++;
        }
        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            have[s2.charAt(r) - 'a']++;
            while (have[s2.charAt(r) - 'a'] > need[s2.charAt(r) - 'a']) {
                have[s2.charAt(l) - 'a']--;
                l++;
            }
            if (r - l + 1 == s1.length()) return true;
        }
        return false;
    }
}
