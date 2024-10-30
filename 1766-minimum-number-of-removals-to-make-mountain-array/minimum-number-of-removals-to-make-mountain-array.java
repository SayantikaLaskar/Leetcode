class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        int[] li=new int[n], ld=new int[n];
        Arrays.fill(li, 1);
        Arrays.fill(ld, 1);
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    li[i]=Math.max(li[i],li[j]+1);
                }
            }
        }
        for(int i=n-1; i>=0; --i){
            for(int j=n-1; j>i; --j){
                if(nums[i]>nums[j]){
                    ld[i]=Math.max(ld[i], ld[j]+1);
                }
            }
        }
        int m=0;
        for(int i=1; i<n-1; ++i){
            if(li[i]>1 && ld[i]>1){
                m=Math.max(m, li[i]+ld[i]-1);
            }
        }
        return n-m;
    }
}