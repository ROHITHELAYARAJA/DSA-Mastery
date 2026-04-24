class Solution {
    public int nthUglyNumber(int n) {
        int m=n;
        int arr[] = new int[n];
        arr[0] = 1;
        int i1 = 0,i2=0,i3=0;
        int j = 1 ;
        while(j<n){
            int p1 = arr[i1]*2;
            int p2 = arr[i2]*3;
            int p3 = arr[i3]*5;
            int mini = Math.min(p1,p2);
            mini = Math.min(mini,p3);
            arr[j] = mini;
            if(mini==p1){
                i1++;
            }
            if(mini==p2){
                i2++;
            }
            if(mini==p3){
                i3++;
            }
            j++;
        }
        return arr[m-1];
    }
}