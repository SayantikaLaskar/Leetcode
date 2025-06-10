class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> c=new HashMap<>();
        int l=0, r=0, res=0;
        while(r<s.length()){
            char re=s.charAt(r);
            c.put(re, c.getOrDefault(re, 0)+1);
            while(c.get(re)>1){
                char le=s.charAt(l);
                c.put(le, c.get(le)-1);
                l++;
            }
            res=Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}