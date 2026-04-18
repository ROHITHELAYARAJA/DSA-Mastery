import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String check = strs[0];
        for(int i=1;i<strs.length;i++){
            while(!(strs[i].startsWith(check))){
                check = check.substring(0,check.length()-1);
            }
            if(check.isEmpty()){
                return "";
            }
        }
        return check;
    }
}