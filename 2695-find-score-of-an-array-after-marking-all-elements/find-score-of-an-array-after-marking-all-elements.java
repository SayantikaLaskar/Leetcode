class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][2];
        for(int i=0; i<n; i++){
            dp[i][0]=nums[i];
            dp[i][1]=i;
        }
        Arrays.sort(dp, (a,b)->a[0]-b[0]);
        boolean[] m=new boolean[n];
        long r=0;
        for(int[] arr:dp){
            int v=arr[0];
            int ind=arr[1];
            if(!m[ind]){
                r+=v;
                m[ind]=true;
                if(ind>0)
                    m[ind-1]=true;
                if(ind<n-1)
                    m[ind+1]=true;
            }
        }
        return r;
    }
}