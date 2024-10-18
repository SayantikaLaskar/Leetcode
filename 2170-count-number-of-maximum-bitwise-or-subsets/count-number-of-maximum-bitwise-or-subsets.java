class Solution {
    public void b(int[] nums, int index, int currentOr, int m, int[] c){
        if(currentOr==m){
            c[0]++;
        }
        for(int i=index; i<nums.length; i++){
            b(nums, i+1, currentOr|nums[i], m, c);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int m=0;
        for(int num:nums){
            m|=num;
        }
        int[] c=new int[1];
        b(nums, 0, 0, m, c);
        return c[0];
    }
}