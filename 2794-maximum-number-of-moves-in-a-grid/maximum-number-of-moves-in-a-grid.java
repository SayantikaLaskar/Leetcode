class Solution {
    public int maxMoves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int r=0;
        int[] dp=new int[m];
        for(int j=1; j<n; j++){
            int l=0;
            boolean f=false;
            for(int i=0; i<m; i++){
                int c=-1;
                int nx=dp[i];
                if(i-1>=0 && l!=-1 && grid[i][j]>grid[i-1][j-1]){
                    c=Math.max(c, l+1);
                }
                if(dp[i]!=-1 && grid[i][j]>grid[i][j-1]){
                    c=Math.max(c, dp[i]+1);
                }
                if(i+1<m && dp[i+1]!=-1 && grid[i][j]>grid[i+1][j-1]){
                    c=Math.max(c, dp[i+1]+1);
                }
                dp[i]=c;
                f=f || (dp[i]!=-1);
                l=nx;
            }
            if(!f) break;
            r=j;
        }
        return r;
    }
}