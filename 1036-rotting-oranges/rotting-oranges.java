class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int cf=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i, j});
                } else if(grid[i][j]==1){
                    cf++;
                }
            }
        }
        if(cf==0) return 0;
        int ct=0;
        int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            ++ct;
            int s=q.size();
            for(int i=0; i<s; i++){
                int[] p=q.poll();
                for(int dr[]:d){
                    int x=p[0]+dr[0];
                    int y=p[1]+dr[1];
                    if(x<0 || y<0 || x>=r || y>=c || grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y]=2;
                    q.offer(new int[]{x, y});
                    cf--;
                }
            }
        }
        return cf==0?ct-1:-1;
    }
}