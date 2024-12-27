class Solution {
    public int largestAltitude(int[] gain) {
        int x[]=new int[gain.length+1];
        x[0]=0;
        for(int i=0; i<gain.length; i++){
            x[i+1]=x[i]+gain[i];
        }
        Arrays.sort(x);
        return x[gain.length];
    }
}