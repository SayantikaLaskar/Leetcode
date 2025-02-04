class Solution {
    public int maxAscendingSum(int[] nums) {
        int c=nums[0], a=nums[0];
        for(int i=1; i<nums.length; i++){
            c=nums[i]>nums[i-1]?c+nums[i]:nums[i];
            a=Math.max(a, c);
        }
        return a;
    }
}