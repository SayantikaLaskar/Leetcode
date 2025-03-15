class Solution {
    private boolean s(int[] n, int k, int c){
        int co=0;
        int i=0;
        while(i<n.length){
            if(n[i]<=c){
                co++;
                i+=2;
            }else{
                i++;
            }
        }
        return co>=k;
    }
    public int minCapability(int[] nums, int k) {
        int l=Arrays.stream(nums).min().getAsInt();
        int r=Arrays.stream(nums).max().getAsInt();
        while(l<r){
            int m=l+(r-l)/2;
            if(s(nums, k, m)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}