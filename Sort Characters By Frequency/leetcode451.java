import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue()-a.getValue());
        StringBuilder answer = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            int val = entry.getValue();
           for(int i=0;i<val;i++){
            answer.append(entry.getKey());
           }
        }
        return answer.toString();
    }
}