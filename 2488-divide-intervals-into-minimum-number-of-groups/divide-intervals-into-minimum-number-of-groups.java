class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] s=new int[n];
        int[] e=new int[n];
        for(int i=0; i<n; i++){
            s[i]=intervals[i][0];
            e[i]=intervals[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int ep=0, g=0;
        for(int st:s){
            if(st>e[ep]){
                ep++;
            }else{
                g++;
            }
        }
        return g;
    }
}