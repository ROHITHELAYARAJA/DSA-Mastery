class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
                int [] freq = new int[26];
            for(int j=i;j<s.length();j++){
                int max = Integer.MIN_VALUE ;
                int min = Integer.MAX_VALUE;
                freq[s.charAt(j)-'a']++;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                    max = Math.max(max,freq[k]);
                    min = Math.min(min,freq[k]);
                    }
                }
                sum+=(max-min);
              
            }
        }
        return sum;
    }
}