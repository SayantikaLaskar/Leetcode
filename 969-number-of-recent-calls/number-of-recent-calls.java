class RecentCounter {
    private static final int[] r=new int[10000];
    private int s;
    private int e;
    public RecentCounter() {
        s=0;
        e=0;
    }
    
    public int ping(int t) {
        while(s<e && (t-r[s]>3000)){
            s++;
        }
        r[e++]=t;
        return e-s;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */