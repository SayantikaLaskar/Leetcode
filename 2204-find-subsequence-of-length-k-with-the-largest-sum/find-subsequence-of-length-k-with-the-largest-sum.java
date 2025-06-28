class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b)->Integer.compare(a[0], b[0]));
        for(int i=0; i<nums.length; i++){
            pq.offer(new int[]{nums[i], i});
            if(pq.size()>k) pq.poll();
        }
        int[][] in=pq.toArray(new int[0][0]);
        Arrays.sort(in, Comparator.comparingInt(a->a[1]));
        int[] r=new int[k];
        for(int i=0; i<k; i++){
            r[i]=nums[in[i][1]];
        }
        return r;
    }
}