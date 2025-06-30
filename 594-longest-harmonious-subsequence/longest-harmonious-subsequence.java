class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0, r=1, res=0;
        while(r<nums.length){
            int d=nums[r]-nums[l];
            if(d==1){
                res=Math.max(res, r-l+1);
            }
            if (d<=1){
                r++;
            }else{
                l++;
            }
        }
        return res;
    }
}