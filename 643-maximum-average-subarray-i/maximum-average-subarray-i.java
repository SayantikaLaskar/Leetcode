class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        int s=0;
        for(int i=0; i<k; i++){
            s+=nums[i];
        }
        double m=(double)s/k;
        for(int j=k; j<l; j++){
            s+=nums[j]-nums[j-k];
            m=Math.max(m, (double)s/k);
        }
        return m;
    }
}