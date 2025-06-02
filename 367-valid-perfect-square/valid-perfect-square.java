class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1, r=num;
        while(l<=r){
            int m=(l+r)/2;
            long ms=(long)m*m;
            if(ms==num){
                return true;
            }else if(ms>num){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return false;
    }
}