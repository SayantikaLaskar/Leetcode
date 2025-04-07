class Solution {
    public boolean canPartition(int[] nums) {
       int t=0;
       for(int n:nums) t+=n;
       if(t%2!=0) return false;
       int s=t/2;
       boolean[] d=new boolean[s+1];
       d[0]=true;
       for(int n:nums){
        for(int c=s; c>=n; c--){
            d[c]=d[c]||d[c-n];
            if(d[s]) return true;
       } 
    }
    return d[s];
    }
}