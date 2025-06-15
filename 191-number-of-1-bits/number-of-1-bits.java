class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            int d=n%2;
            n=n/2;
            if(d==1){
                c++;
            }
        }
        return c;
    }
}