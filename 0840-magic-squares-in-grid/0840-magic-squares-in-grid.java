class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int answer=0;

        if(n<3 || m<3) return 0;

        // Time - O(n*m)
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(i+3<=n && j+3<=m){
 
                    boolean[] visited = new boolean[16]; // Space O(16) for every n*m iteration . Nearly constant
                    // Time - O(3*3)-constant
                    for(int row = i;row<i+3;row++){
                        for(int col=j;col<j+3;col++){
                            visited[grid[row][col]]=true;
                        }
                    }
                    // System.out.println(Arrays.toString(visited));
                    boolean flag = false;
                    // Time -: O(constant)
                    for(int ind=1;ind<=9;ind++) if(!visited[ind]){
                        flag = true;
                        break;
                    }

                    // Time-: for all below operation is O(Constant)
                    if(!flag){
                        HashSet<Integer> set = new HashSet<>();// Space -: O(9) is the worst case and that to not for every iteration.
                        int row1 = grid[i][j]+grid[i][j+1]+grid[i][j+2];
                        int row2 = grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
                        int row3 = grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
                        int col1 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
                        int col2 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
                        int col3 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
                        int diagonal1 = grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                        int diagonal2 = grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
                        set.add(row1); set.add(row2); set.add(row3); set.add(col1);
                        set.add(col2); set.add(col3); set.add(diagonal1); set.add(diagonal2);

                        if(set.size()==1) answer++;
                    }
                }
            }
        }

        return answer;
        
    }
}