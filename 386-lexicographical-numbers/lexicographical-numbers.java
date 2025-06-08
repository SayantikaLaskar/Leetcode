class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> r=new ArrayList<>();
        int c=1;
        for(int i=0; i<n; i++){
            r.add(c);
            if(c*10<=n){
                c*=10;
            }else{
                if(c>=n) c/=10;
                c++;
                while(c%10==0){
                    c/=10;
                }
            }
        }
        return r;
    }
}