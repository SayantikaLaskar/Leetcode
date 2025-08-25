class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat[0].length==0) return new int[0];
        int m=mat.length;
        int n=mat[0].length;
        int[] a=new int[m*n];
        int i=0, r=0, c=0;
        boolean up=true;
        while(r<m && c<n){
            if(up){
                while(r>0 && c<n-1){
                    a[i++]=mat[r][c];
                    r--;
                    c++;
                }
                a[i++]=mat[r][c];
                if(c==n-1){
                    r++;
                }else{
                    c++;
                }
            }else{
                while(c>0 && r<m-1){
                    a[i++]=mat[r][c];
                    r++;
                    c--;
                }
                a[i++]=mat[r][c];
                if(r==m-1){
                    c++;
                }else{
                    r++;
                }
            }
            up=!up;
        }
        return a;
    }
}