class Solution {
    public int maxScore(String s) {
        int t=0, z=0, o=0, b=Integer.MIN_VALUE;
        for(char ch:s.toCharArray()){
            if(ch=='1') t++;
        }
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='0') z++;
            else o++;
            int c=z+(t-o);
            b=Math.max(b, c);
        }
        return b;
    }
}