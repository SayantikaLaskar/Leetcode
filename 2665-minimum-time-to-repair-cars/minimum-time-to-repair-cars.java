class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1, r=(long)Arrays.stream(ranks).min().getAsInt()*cars*cars;
        while(l<r){
            long m=(l+r)/2;
            if(c(ranks, cars, m)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    private boolean c(int[] r, int c, long t){
        long to=0;
        for(int ra:r){
            to+=Math.sqrt(t/ra);
            if(to>=c) return true;
        }
        return false;
    }
}