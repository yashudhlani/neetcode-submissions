class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> st = new Stack<>();

        for (char c: s.toCharArray()) {
            if (map.get(c) == null) {
                st.push(c);
                continue;
            }
            if (st.isEmpty() || !map.get(c).equals(st.peek())) {
                return false;
            }
            st.pop();
        }
        return st.isEmpty();
    }
}
