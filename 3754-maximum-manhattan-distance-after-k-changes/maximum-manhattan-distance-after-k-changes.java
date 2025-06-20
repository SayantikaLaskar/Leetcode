class Solution {
    public int maxDistance(String s, int k) {
        int a=0, n=0, so=0, e=0, w=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='N') n++;
            else if(c=='S') so++;
            else if(c=='E') e++;
            else if(c=='W') w++;
            int x=Math.abs(n-so);
            int y=Math.abs(e-w);
            int md=x+y;
            int dis=md+Math.min(2*k, i+1-md);
            a=Math.max(a, dis);
        }
        return a;
    }
}