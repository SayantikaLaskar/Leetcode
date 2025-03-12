class Solution {
    public int maximumCount(int[] nums) {
        int n=b(nums, 0);
        int p=nums.length-b(nums, 1);
        return Math.max(n, p);
    }
    private int b(int[] n, int t){
        int l=0, r=n.length-1, re=n.length;
        while(l<=r){
            int m=(l+r)/2;
            if(n[m]<t){
                l=m+1;
            }else{
                re=m;
                r=m-1;
            }
        }
        return re;
    }
}