class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] r=new int[nums.length];
        int l=0, ri=nums.length-1;
        for(int i=0, j=nums.length-1; i<nums.length; i++, j--){
            if(nums[i]<pivot){
                r[l]=nums[i];
                l++;
            }
            if(nums[j]>pivot){
                r[ri]=nums[j];
                ri--;
            }
        }
        while(l<=ri){
            r[l]=pivot;
            l++;
        }
        return r;
    }
}