class Solution {
    static final int MOD=1000000007;
    public int countGoodNumbers(long n) {
        long e=(n+1)/2;
        long o=n/2;
        long ew=f(5, e);
        long ow=f(4, o);
        return (int)((ew*ow)%MOD);
    }
    long f(long b, long p){
        long r=1;
        b%=MOD;
        while(p>0){
            if(p%2==1){
                r=(r*b)%MOD;
            }
            b=(b*b)%MOD;
            p/=2;
        }
        return r;
    }
}