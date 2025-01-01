class Solution {
    public int equalPairs(int[][] grid) {
        int p=0, t=0, r=0;
        while(t<=grid.length-1){
            HashMap<Integer, Integer> m=new HashMap<>();
            for(int j=0; j<grid.length; j++){
                m.put(j, grid[r][j]);
            }
            for(int i=0; i<grid.length; i++){
                int c=0;
                for(int k=0; k<grid.length; k++){
                    if(m.get(k)!=grid[k][i]){
                        c=0;
                        break;
                    }else
                        c=1;
                }
                p+=c;
            }
            r++;
            t++;
        }
        return p;
    }
}