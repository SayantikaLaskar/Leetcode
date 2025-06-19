class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int a=1, m=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]-m>k){
                a++;
                m=nums[i];
            }
        }
        return a;
    }
}