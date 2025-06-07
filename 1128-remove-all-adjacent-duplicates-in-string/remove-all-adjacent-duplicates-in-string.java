class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> t=new Stack<>();
        StringBuilder p=new StringBuilder();
        int n=s.length();
        int i=1;
        t.push(s.charAt(0));
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