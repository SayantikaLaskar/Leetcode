class Solution {
    private long an=0;
    public long minimumFuelCost(int[][] roads, int seats) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        int n=roads.length+1;
        an=0L;
        for(int i=0; i<n; i++){
            a.add(new ArrayList<>());
        }
        for(int[] b:roads){
            a.get(b[0]).add(b[1]);
            a.get(b[1]).add(b[0]);
        }
        solve(a, seats, 0, -1);
        return an;
    }
    private long solve(ArrayList<ArrayList<Integer>> a, int s, int sr, int pa){
        long p=1L;
        for(int i:a.get(sr)){
            if(i!=pa){
                p+=solve(a, s, i, sr);
            }
        }
        if(sr!=0){
                an+=(long)Math.ceil((double)p/s);
            }
        return p;
    }
}