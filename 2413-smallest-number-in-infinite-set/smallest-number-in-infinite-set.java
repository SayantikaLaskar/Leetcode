class SmallestInfiniteSet {
    private byte[] a;
    private int m;
    public SmallestInfiniteSet() {
        this.a=new byte[1001];
        this.m=0;
    }
    
    public int popSmallest() {
        while(a[m++]==1);
        a[m-1]=1;
        return m;
    }
    
    public void addBack(int num) {
        a[num-1]=0;
        m=Math.min(m, num-1);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */