class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int c=0, cc=0;
        for(int i: nums){
            c+=i;
            cc+=i;
            max=Math.max(c, max);
            min=Math.min(cc, min);
            if(c<0) c=0;
            if(cc>0) cc=0;
        }
        min=Math.abs(min);
        return Math.max(min, max);
    }
}