class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = Mini_Bannana(piles, mid);
            if (total <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static long Mini_Bannana(int[] arr, int target) {
        long tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot += (arr[i] + target - 1) / target;
        }
        return tot;
    }
}