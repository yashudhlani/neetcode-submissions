class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1 ;

        while (i < j) {
            char ch = s.charAt(i);
            while (i < j && !(('a' <= ch && 'z' >= ch) || ('A' <= ch && 'Z' >= ch) || ('0' <= ch && '9' >= ch))) {
                i++;
                ch = s.charAt(i);
            }
            while (i < j && !(('a' <= s.charAt(j) && 'z' >= s.charAt(j)) || ('A' <= s.charAt(j) && 'Z' >= s.charAt(j)) || ('0' <= s.charAt(j) && '9' >= s.charAt(j)))) {
                j--;
            }
            System.out.println(i + " " + j);
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true; 
    }
}
