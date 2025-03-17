class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r=maze.length;
        int c=maze[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.offer(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int[][] d=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int s=0;
        int x, y;
        while(!q.isEmpty()){
            s++;
            int n=q.size();
            for(int i=0; i<n; i++){
                int[] cu=q.poll();
                for(int[] di:d){
                    x=cu[0]+di[0];
                    y=cu[1]+di[1];
                    if(x<0 || x>=r || y<0 || y>=c) continue;
                    if(maze[x][y]=='+') continue;
                    if(x==0 || x==r-1 || y==0 || y==c-1) return s;
                    maze[x][y]='+';
                    q.offer(new int[]{x, y});
                }
            }
        }
        return -1;
    }
}