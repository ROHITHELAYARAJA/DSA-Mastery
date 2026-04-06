class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int state = 1;
        boolean visited = false;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return false;
            }
            if (nums[i] > nums[i - 1]) {
                visited = true;
                if (state == 2) {
                    state = 3;
                } else if (state == 3) {
                    continue;
                }
            } else {
                if (visited == true) {
                    if (state == 1) {
                        state = 2;
                    } else if (state == 3) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return state == 3;
    }
}