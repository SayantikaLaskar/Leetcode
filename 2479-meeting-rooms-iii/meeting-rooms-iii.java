class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long[] ra=new long[n];
        int[] mc=new int[n];
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        for(int[] mt: meetings){
            int st=mt[0];
            int et=mt[1];
            long m=Long.MAX_VALUE;
            int mr=0;
            boolean f=false;
            for(int i=0; i<n; i++){
                if(ra[i]<=st){
                    f=true;
                    mc[i]++;
                    ra[i]=et;
                    break;
                }if(m>ra[i]){
                    m=ra[i];
                    mr=i;
                }
            }
            if(!f){
                ra[mr]+=et-st;
                mc[mr]++;
            }
        }
        int max=0, mca=0;
        for(int i=0; i<n; i++){
            if(mc[i]>max){
                max=mc[i];
                mca=i;
            }
        }

        return mca;
    }
}