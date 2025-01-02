class Solution {
    int i=0;
    String solve(String s) {
        StringBuilder sb=new StringBuilder("");
        while(i<s.length()){
            if(Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
            else if(s.charAt(i)==']'){
                return sb.toString();
            }
            else if(Character.isDigit(s.charAt(i))){
                int c=0;
                while(Character.isDigit(s.charAt(i))){
                    c=c*10 + Integer.valueOf(s.charAt(i)-'0');
                    i++;
                }
                i++;
                String next=solve(s);
                while(c-->0) sb.append(next);
            }
            i++;
        }
        return sb.toString();
    }
    public String decodeString(String s) {
        return solve(s);
    }
}