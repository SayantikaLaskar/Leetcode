class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length(), a=0;
        var v=Set.of('a', 'e', 'i', 'o', 'u');
        for(int i=0, j=0; i<n; i++){
            if(v.contains(s.charAt(i))){
                ++j;
            }
            if(i>=k && v.contains(s.charAt(i-k))){
                --j;
            }
            a=Math.max(j, a);
        }
        return a;
    }
}