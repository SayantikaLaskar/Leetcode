class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0) return 0;
        int m=1, in=1, d=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                in++;
                d=1;
            }else if(nums[i]<nums[i-1]){
                d++;
                in=1;
            }else{
                in=1;
                d=1;
            }
            m=Math.max(m, Math.max(in, d));
        }
        return m;
    }
}