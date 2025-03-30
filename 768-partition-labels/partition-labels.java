class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> l=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            l.put(s.charAt(i), i);
        }
        List<Integer> r=new ArrayList<>();
        int st=0, e=0;
        for(int i=0; i<s.length(); i++){
            e=Math.max(e, l.get(s.charAt(i)));
            if(i==e){
                r.add(e-st+1);
                st=i+1;
            }
        }
        return r;
    }
}