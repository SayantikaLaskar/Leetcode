class Solution {
    public String sortVowels(String s) {
        List<Character> v=new ArrayList<>();
        for(char c: s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                v.add(c);
            }
        }
        Collections.sort(v);
        StringBuilder r=new StringBuilder();
        int vi=0;
        for(char c: s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                r.append(v.get(vi++));
            }else{
                r.append(c);
            }
        }
        return r.toString();
    }
}