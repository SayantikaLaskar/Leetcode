import java.util.PriorityQueue;

class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        long[] suffix = new long[3 * n];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0;
        
        // Compute suffix sums: sum of the largest n elements in the suffix
        for (int i = 3 * n - 1; i >= n; i--) {
            int value = nums[i];
            sum += value;
            minHeap.offer(value);
            if (minHeap.size() > n) {
                sum -= minHeap.poll();
            }
            suffix[i] = sum;
        }
        
        long result = Long.MAX_VALUE;
        sum = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        // Compute prefix sums and find the minimum difference
        for (int i = 0; i < 2 * n; i++) {
            int value = nums[i];
            sum += value;
            maxHeap.offer(value);
            if (maxHeap.size() > n) {
                sum -= maxHeap.poll();
            }
            if (maxHeap.size() == n && i + 1 < 3 * n) {
                result = Math.min(result, sum - suffix[i + 1]);
            }
        }
        
        return result;
    }
}