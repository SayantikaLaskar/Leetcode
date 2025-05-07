import java.util.PriorityQueue;

class Solution {
    // Directions: right, down, left, up
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        // Priority Queue: (arrivalTime, x, y)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, 0, 0}); // Start at (0,0) with arrivalTime 0

        // Initialize minTime matrix with max values
        int[][] minTimeArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                minTimeArr[i][j] = Integer.MAX_VALUE;
            }
        }
        minTimeArr[0][0] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentTime = current[0];
            int x = current[1];
            int y = current[2];

            // If reached the destination, return the time
            if (x == n - 1 && y == m - 1) {
                return currentTime;
            }

            // Explore all adjacent cells
            for (int[] dir : DIRECTIONS) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // Check boundaries
                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    // Calculate the earliest time you can start moving to (newX, newY)
                    int startTime = Math.max(currentTime, moveTime[newX][newY]);
                    // Arrival time is startTime + 1 second
                    int arrivalTime = startTime + 1;

                    // If this path offers a quicker arrival, update and enqueue
                    if (arrivalTime < minTimeArr[newX][newY]) {
                        minTimeArr[newX][newY] = arrivalTime;
                        pq.offer(new int[]{arrivalTime, newX, newY});
                    }
                }
            }
        }

        // If destination is unreachable (shouldn't happen as per constraints)
        return -1;
    }
}
