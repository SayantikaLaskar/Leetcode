class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length, m=1, l=0, u=0;
        for(int r=0; r<n; r++){
            while((u&nums[r])!=0){
                u^=nums[l];
                l++;
            }
            u|=nums[r];
            m=Math.max(m, r-l+1);
        }
        return m;
    }
}