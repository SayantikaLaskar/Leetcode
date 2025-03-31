class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==1){
            return 0;
        }
        List<Integer> p=new ArrayList<>();
        for(int i=0; i<weights.length-1; i++){
            p.add(weights[i]+weights[i+1]);
        }
        Collections.sort(p);
        long m=0, mx=0;
        for(int i=0; i<k-1; i++){
            m+=p.get(i);
            mx+=p.get(p.size()-1-i);
        }
        return mx-m;
    }
}