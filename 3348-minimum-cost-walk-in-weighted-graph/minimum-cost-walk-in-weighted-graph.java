class Solution {
    private int f(int[] p, int n){
        if(p[n]!=n){
            p[n]=f(p, p[n]);
        }
        return p[n];
    }
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] p=new int[n];
        int[] m=new int[n];
        Arrays.fill(m, -1);
        for(int i=0; i<n; i++){
            p[i]=i;
        }
        for(int[] e:edges){
            int s=e[0],t=e[1], w=e[2];
            int sr=f(p, s);
            int tr=f(p, t);
            m[tr]&=w;
            if(sr!=tr){
                m[tr]&=m[sr];
                p[sr]=tr;
            }
        }
        int[] r=new int[query.length];
        for(int i=0; i<query.length; i++){
            int st=query[i][0], en=query[i][1];
            if(st==en){
                r[i]=0;
            }else if(f(p, st)!=f(p, en)){
                r[i]=-1;
            }else{
                r[i]=m[f(p, st)];
            }
        }
        return r;
    }
}