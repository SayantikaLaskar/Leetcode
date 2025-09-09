class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp=new long[n+1];
        dp[1]=1;
        long s=0, MOD=(long)1e9+7;
        for(int t=2; t<=n; t++){
            if(t-delay>0) s=(s+dp[t-delay]+MOD)%MOD;
            if(t-forget>0) s=(s-dp[t-forget]+MOD)%MOD;
            dp[t]=s;
        }
        long k=0;
        for(int i=n-forget+1; i<=n; i++) k=(k+dp[i])%MOD;
        return (int)k;
    }
}