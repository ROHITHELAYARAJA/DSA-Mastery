class Solution {
    public int maxDistance(int[] n1, int[] n2) {
        int i = 0;
        int j = 0;
        int max = 0;
        while(i<n1.length && j<n2.length){
            if(n1[i]<=n2[j] && i<n1.length && j<n2.length){
                max = Math.max(max,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return max;
    }
}