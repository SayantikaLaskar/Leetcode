class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] c=new int[20001];
        for(int n: nums){
            c[n+10000]++;
        }
        for(int i=c.length-1; i>=0; i--){
            if(c[i]>0){
                k-=c[i];
                if(k<=0) return i-10000;
            }
        }
        return -1;
    }
}