class Solution {
    public int[] sortArray(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        merge_sort(nums,s,e); 
        return nums;
    }
    static void merge_sort(int [] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        merge_sort(arr,s,mid);
        merge_sort(arr,mid+1,e);
        merge_inplace(arr,s,mid,e);
    }
    static void merge_inplace(int [] arr,int s,int mid,int e){
        int  merge [] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                merge[k++] = arr[i++];
            }
            else{
                merge[k++] = arr[j++];
            }
        }
        while(i<=mid){
            merge[k++] = arr[i++];
        }
        while(j<=e){
            merge[k++] = arr[j++];
        }
        for(int l=0;l<merge.length;l++){
            arr[s+l] = merge[l];
        }
    } 
}