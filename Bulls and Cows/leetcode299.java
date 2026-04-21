import java.util.*;
class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map = new HashMap<>();
        int bull = 0;
        int cow = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            else{
                char c1 = secret.charAt(i);
                char c2 = guess.charAt(i); 
                if(map.getOrDefault(c1,0)<0){ // c2 checking 
                    cow++;
                }
                if(map.getOrDefault(c2,0)>0){ // c1 checking
                    cow++;
                }
                    map.put(c1,map.getOrDefault(c1,0)+1);
                    map.put(c2,map.getOrDefault(c2,0)-1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bull);
        sb.append("A");
        sb.append(cow);
        sb.append("B");
        return sb.toString();
    }
}