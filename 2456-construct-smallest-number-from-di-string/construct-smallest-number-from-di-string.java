class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder a=new StringBuilder("1");
        StringBuilder t=new StringBuilder();
        for(int i=0; i<pattern.length(); i++){
            if(pattern.charAt(i)=='I'){
                a.append(t).append((char)('2'+i));
                t.setLength(0);
            }else{
                t.insert(0, a.charAt(a.length()-1));
                a.setLength(a.length()-1);
                a.append((char)('2'+i));
            }
        }
        return a.append(t).toString();
    }
}