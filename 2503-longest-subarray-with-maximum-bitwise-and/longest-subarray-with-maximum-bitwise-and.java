class Solution {
    public int longestSubarray(int[] nums) {
        int m=0, a=0, c=0;
        for(int i: nums){
            if(i==m) c+=1;
            else if(i>m){
                c=a=1;
                m=i;
            }else{
                c=0;
            }
            a=Math.max(c, a);
        }
        return a;
    }
}