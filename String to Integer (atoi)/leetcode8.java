class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long tot = 0;
        int i = 0;
        int sign = 1;
        if (s.isEmpty())
            return 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        for (int j = i; j < s.length(); j++) {
            char x = s.charAt(j);
            if (x >= '0' && x <= '9') {
                int num = x - '0';
                tot = (tot * 10) + num;
                if (tot * sign >= Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (tot * sign <= Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            } else {
                break;
            }
        }
        return (int) tot * sign;
    }
}