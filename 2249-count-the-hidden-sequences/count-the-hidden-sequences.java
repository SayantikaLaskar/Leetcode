class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long a=0, mx=0, mn=0;
        for(int i=0; i<differences.length; i++){
            a+=differences[i];
            mx=Math.max(mx, a);
            mn=Math.min(mn, a);
        }
        return (int)Math.max(0, (upper-lower)-(mx-mn)+1);
    }
}