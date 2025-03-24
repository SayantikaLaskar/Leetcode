class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b)->Integer.compare(a[0], b[0]));
        int m=0;
        int c=-1, ce=-1;
        for(int[] me:meetings){
            int s=me[0], e=me[1];
            if(s>ce){
                if(ce!=-1){
                    m+=(ce-c+1);
                }
                c=s;
                ce=e;
            }else{
                ce=Math.max(ce, e);
            }
        }
        if(ce!=-1){
            m+=(ce-c+1);
        }
        return days-m;
    }
}