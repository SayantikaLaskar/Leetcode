class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int c=Integer.MAX_VALUE/2;
        for(int i=0; i<nums.length-2; i++){
            int l=i+1, r=nums.length-1;
            while(l<r){
                int cur=nums[i]+nums[l]+nums[r];
                if(Math.abs(cur-target)<Math.abs(c-target)){
                    c=cur;
                }
                if(cur<target){
                    ++l;
                }else if(cur>target){
                    --r;
                }else{
                    return cur;
                }
            }
        }
        return c;
    }
}