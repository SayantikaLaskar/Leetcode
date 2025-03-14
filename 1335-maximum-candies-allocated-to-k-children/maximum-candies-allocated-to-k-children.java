class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1, r=10000000;
        int re=0;
        while(l<=r){
            int m=l+(r-l)/2;
            long c=0;
            for(int ca:candies){
                c+=ca/m;
            }
            if(c>=k){
                re=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return re;
    }
}