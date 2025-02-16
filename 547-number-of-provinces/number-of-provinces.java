class Solution {
    public void dfs(int[][] M, int[] v, int i){
        for(int j=0; j<M.length; j++){
            if(M[i][j]==1 && v[j]==0){
                v[j]=1;
                dfs(M, v, j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int[] v=new int[isConnected.length];
        int c=0;
        for(int i=0; i<isConnected.length; i++){
            if(v[i]==0){
                dfs(isConnected, v, i);
                c++;
            }
        }
        return c;
    }
}