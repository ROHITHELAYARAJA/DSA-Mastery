class Solution {
    public int reverse(int x) {
        int count = 0;
        int f = x;
        int p = 0;
        if (x < 0) {
            x = -x;
        }
        while (x > 0) {
            int k = x % 10;
            if (count > 214748364 || count < -214748364)
                return 0;
            count = count * 10 + k;
            x = x / 10;
        }
        if (f < 0)
            count = -count;
        return count;
    }
}