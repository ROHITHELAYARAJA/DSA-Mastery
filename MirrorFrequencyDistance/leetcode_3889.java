import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int mirrorFrequency(String s) {
        int freq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashSet<Character> visited = new HashSet<>();
        char mirror;
        for (Character mapi : map.keySet()) {
            if (visited.contains(mapi)) {
                continue;
            }
            if (mapi >= 'a' && mapi <= 'z') {
                mirror = (char) ('z' - (mapi - 'a'));
            } else {
                mirror = (char) ('9' - (mapi - '0'));
            }
            int freqC = map.getOrDefault(mapi, 0);
            int freqM = map.getOrDefault(mirror, 0);
            freq += Math.abs(freqC - freqM);
            visited.add(mapi);
            visited.add(mirror);
        }
        return freq;
    }
}