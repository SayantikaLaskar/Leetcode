class Solution {
    public String countAndSay(int n) {
        String r="1";
        for(int i=1; i<n; i++){
            StringBuilder t=new StringBuilder();
            int c=1;
            for(int j=1; j<r.length(); j++){
                if(r.charAt(j)==r.charAt(j-1)){
                    c++;
                }else{
                    t.append(c).append(r.charAt(j-1));
                    c=1;
                }
            }
            t.append(c).append(r.charAt(r.length()-1));
            r=t.toString();
        }
        return r;
    }
}