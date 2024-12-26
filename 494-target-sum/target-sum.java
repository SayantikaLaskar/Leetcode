class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }
    private int helper(int[] arr, int t, int i, int s){
        if(i>=arr.length) return s==t?1:0;
        int sub=helper(arr, t, i+1, s-arr[i]);
        int add= helper(arr, t, i+1, s+arr[i]);
        return sub+add; 
    }
}