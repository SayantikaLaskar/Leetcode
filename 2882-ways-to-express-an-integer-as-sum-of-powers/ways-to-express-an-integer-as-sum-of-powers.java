class Solution {
    static final int MOD=1000000007;
    Map<String, Integer> memo=new HashMap<>();
    public int numberOfWays(int n, int x) {
        return dfs(n, 1, x);
    }
    private int dfs(int r, int c, int x){
        if(r==0) return 1;
        if(r<0 || Math.pow(c, x)>r) return 0;
        String k=r+","+c;
        if(memo.containsKey(k)) return memo.get(k);
        int p=(int)Math.pow(c, x);
        int i=dfs(r-p, c+1, x);
        int s=dfs(r, c+1, x);
        int t=(i+s)%MOD;
        memo.put(k, t);
        return t;
    }
}