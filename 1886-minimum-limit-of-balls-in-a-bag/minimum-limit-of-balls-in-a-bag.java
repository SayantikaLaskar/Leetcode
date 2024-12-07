class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1, h=Arrays.stream(nums).max().getAsInt();
        while(l<h){
            int m=(l+h)/2;
            int o=0;
            for(int n:nums){
                o+=(n-1)/m;
            }
            if(o<=maxOperations) h=m;
            else l=m+1;
        }
        return h;
    }
}