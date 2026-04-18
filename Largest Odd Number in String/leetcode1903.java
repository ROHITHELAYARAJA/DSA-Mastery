class Solution {
    public String largestOddNumber(String s) {
        // Find the last odd digit in the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                return (s.substring(0,i+1));
            }
        }
        return "";
    }
}