class Solution {
    public int maxFreqSum(String s) {
        int[] f=new int[26];
        int mv=0, mc=0;
        for(char c:s.toCharArray()){
            int i=c-'a';
            f[i]++;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                mv=Math.max(mv, f[i]);
            }else{
                mc=Math.max(mc, f[i]);
            }
        }
        return mv+mc;
    }
}