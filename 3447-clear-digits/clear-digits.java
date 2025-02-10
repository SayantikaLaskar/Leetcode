class Solution {
    public String clearDigits(String s) {
        StringBuilder r=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(r.length()>0){
                    r.deleteCharAt(r.length()-1);
                }
            }else{
                r.append(c);
            }
        }
        return r.toString();
    }
}