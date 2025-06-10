class Solution {
    public String longestPrefix(String s) {
        int[] dp=new int[s.length()];
        int p=0, i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(p)){
                dp[i++]=++p;
            }else{
                if(p>0){
                    p=dp[p-1];
                }else{
                    dp[i++]=0;
                }
            }
        }
        return s.substring(0, dp[dp.length-1]);
    }
}