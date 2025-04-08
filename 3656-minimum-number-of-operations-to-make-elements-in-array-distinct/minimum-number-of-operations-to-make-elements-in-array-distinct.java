class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] s=new boolean[101];
        for(int i=nums.length-1; i>=0; i--){
            if(s[nums[i]]){
                return (i+3)/3;
            }
            s[nums[i]]=true;
        }
        return 0;
    }
}