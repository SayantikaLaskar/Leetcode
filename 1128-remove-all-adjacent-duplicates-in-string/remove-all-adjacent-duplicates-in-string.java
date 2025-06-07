class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> t=new Stack<>();
        int n=s.length();
        StringBuilder p=new StringBuilder();
        t.push(s.charAt(0));
        int i=1;
        while(i<n){
            if(!t.isEmpty() && t.peek()==s.charAt(i)){
                t.pop();
            }else{
                t.push(s.charAt(i));
            }
            i++;
        }
        while(!t.isEmpty()){
            p.append(t.pop());
        }
        return p.reverse().toString();
    }
}