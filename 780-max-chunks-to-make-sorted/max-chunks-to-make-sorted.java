class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr==null || arr.length==0)
            return 0;
        int c=0, m=0;
        for(int i=0; i<arr.length; i++){
            m=Math.max(m, arr[i]);
            if(m==i)
                c++;
        }
        return c;
    }
}