class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b)->a[0]-b[0]);
        int d=0, r=0, in=0, n=events.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(!pq.isEmpty() || in<n){
            if(pq.isEmpty()){
                d=events[in][0];
            }
            while(in<n && events[in][0]<=d){
                pq.offer(events[in][1]);
                in++;
            }
            pq.poll();
            d++;
            r++;
            while(!pq.isEmpty() && pq.peek()<d){
                pq.poll();
            }
        } 
        return r;
    }
}