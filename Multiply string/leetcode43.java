class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int ans[]  = new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int pos1 = i+j;
                int pos2 = i+j+1;
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = mul+ans[pos2];
                ans[pos2] = sum%10;
                ans[pos1] += sum/10;
            }
        } 
        StringBuilder sb = new StringBuilder();
        for(int i:ans){
         if(!(sb.length()==0 && i==0))
              sb.append(i);
        }
     
        return sb.toString();
    }
}