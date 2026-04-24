class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int blank = 0;
        for(char i:moves.toCharArray()){
            if(i=='L') left++;
            else if(i=='R') right++;
            else blank++;
        }
           return Math.abs(left - right) + blank;
    }
}