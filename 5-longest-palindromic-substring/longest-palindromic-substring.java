class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==0) return "";
        String r=s.substring(0, 1);
        for(int c=0; c<n; c++){
            r=ex(s, c, c, r);
            r=ex(s, c, c+1, r);
        } 
        return r;
    }
    private String ex(String s, int l, int r, String c){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        String np=s.substring(l+1, r);
        if (np.length()>c.length()){
            return np;
        }else{
            return c;
        }
    }
}