class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length, l=0, z=0, a=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0){
                z++;
            }
            while(z>1){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            a=Math.max(a, r-l+1-z);
        }
        return (a==n)?a-1:a;
    }
}