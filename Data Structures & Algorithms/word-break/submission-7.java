class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();
    private boolean search(String s, int i, List<String> wordDict) {
        if (i >= s.length()) return true;
        if (memo.containsKey(i)) return memo.get(i);
        boolean found = false;
        for (int j = i + 1; j <= s.length(); j++) {
            if (wordDict.contains(s.substring(i, j))) {
                found = found || search(s, j, wordDict);
            }
        }
        memo.put(i, found);
        return found;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return search(s, 0, wordDict);
    }
}
