class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') left++;
            else if(ch=='R') right++;
            else if(ch=='U') up++;
            else down++;
        }
        int check1 = Math.abs(left-right);
        int check2 = Math.abs(up-down);
        if(check1>0 || check2>0){
            return false;
        }
        return true;
    }
}