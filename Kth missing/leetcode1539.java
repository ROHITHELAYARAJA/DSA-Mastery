class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(high==-1){
            return k;
        }
        int missed_ind = arr[high];
        int ans = missed_ind+(k-(arr[high]-high-1));
        return ans;
    }
}