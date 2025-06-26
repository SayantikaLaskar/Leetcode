class Solution {
    public int longestSubsequence(String s, int k) {
        int c=0, sum=0;
        int n=s.length();
        boolean isv=true;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='0'){
                c++;
            }else if(isv){
                int idx=n-1-i;
                sum+=Math.pow(2, idx);
                if(sum<=k){
                    c++;
                }else{
                    isv=false;
                }
            }
        }
        return c;
    }
}