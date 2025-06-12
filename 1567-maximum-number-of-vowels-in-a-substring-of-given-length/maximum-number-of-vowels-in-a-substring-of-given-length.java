class Solution {
    public int maxVowels(String s, int k) {
        int m=0, w=0;
        Set<Character> v=new HashSet<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        for(int i=0; i<k; i++)
            if(v.contains(s.charAt(i)))
                w++;
        m=w;
        for(int i=k; i<s.length(); i++){
            if(v.contains(s.charAt(i-k))){
                w--;
            }
            if(v.contains(s.charAt(i))){
                w++;
            }
            m=Math.max(m, w);
        }
        return m;
    }
}