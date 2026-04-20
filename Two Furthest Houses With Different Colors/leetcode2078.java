class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        while(left<=right){
            if(colors[left]!=colors[0]){
                max = Math.max(max,left);
            }
            if(colors[left]!=colors[right]){
                max = Math.max(max,right-left);
            }
            left++;
        }
        return max;
    }
}