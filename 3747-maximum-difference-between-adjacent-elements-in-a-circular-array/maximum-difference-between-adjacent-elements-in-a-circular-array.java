class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int m=0;
        for(int i=0; i<nums.length-1; i++)
            m=Math.max(m, Math.abs(nums[i+1]-nums[i]));
        m=Math.max(m, Math.abs(nums[nums.length-1]-nums[0]));
        return m;
    }
}