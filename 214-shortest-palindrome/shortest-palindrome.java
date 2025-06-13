class Solution {
    public String shortestPalindrome(String s) {
        if(s==null || s.isEmpty()){
            return "";
        }
        int i=0;
        for(int j=s.length()-1; j>=0; j--){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
        }
        if(i==s.length()){
            return s;
        }
        String suf=s.substring(i);
        String p=new StringBuilder(suf).reverse().toString();
        String m=shortestPalindrome(s.substring(0, i));
        return p+m+suf;
    }
}