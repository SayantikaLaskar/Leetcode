class Solution {
    private static final int[][] DIRS = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}}; // {dr, dc} -> {change in row, change in column}

    /**
     * The main function that finds the longest V-shaped diagonal segment.
     *
     * @param grid The 2D map with 0s, 1s, and 2s.
     * @return The length of the longest V-shaped diagonal segment.
     */
    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;      // Total number of rows on the map.
        int n = grid[0].length;   // Total number of columns on the map.

        // memo[i][j][state]: This is our "memory". It stores the result of a DFS call
        // starting at cell (i, j) with a specific 'state'.
        // The 'state' is a clever way to encode two things:
        // 1. The current direction of movement (k: 0 to 3).
        // 2. Whether we are still allowed to make a turn (canTurn: 0 or 1).
        // We pack these into a single integer 'mask' using bitwise operations.
        // 'k << 1' shifts the direction bits, and '| canTurn' adds the turn flag.
        // So, memo[i][j][(k << 1) | canTurn] stores the max length from this state.
        int[][][] memo = new int[m][n][8]; // 8 states: 4 directions * 2 possibilities for canTurn.

        int maxLen = 0; // This variable will keep track of the longest V-shape we find.

        // We need to start our search from every cell that contains a '1',
        // as '1' is the mandatory starting point of a V-shape.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell is not a '1', it can't be the start of our V-shape, so we skip it.
                if (grid[i][j] != 1) {
                    continue;
                }

                // If we found a '1', it's a potential starting point.
                // From this '1', we can potentially start moving in any of the 4 diagonal directions.
                for (int k = 0; k < 4; k++) {
                    // We call our DFS helper function to explore paths starting from (i, j)
                    // in direction 'k'.
                    // Initial state:
                    // - (i, j): Starting cell.
                    // - k: The initial direction (0 to 3).
                    // - canTurn: 1 (we are allowed to make a turn initially).
                    // - target: 2 (the value we expect immediately after '1').
                    // - grid: The map.
                    // - memo: Our memory array.
                    
                    // The DFS returns the length of the path *after* the starting '1'.
                    // So, we add 1 to include the starting '1' itself.
                    // We update maxLen if this path is longer than any we've found so far.
                    maxLen = Math.max(maxLen, dfs(i, j, k, 1, 2, grid, memo) + 1);
                }
            }
        }
        return maxLen; // Finally, return the longest V-shape found.
    }

    /**
     * The recursive Depth-First Search function.
     * It explores paths starting from (i, j) in direction 'dir', looking for 'target' value,
     * and considering if a turn is allowed.
     *
     * @param i Current row.
     * @param j Current column.
     * @param dir Current direction index (0-3 in DIRS array).
     * @param canTurn Flag: 1 if a turn is allowed, 0 if not.
     * @param target The value we expect to find in the next cell (either 0 or 2).
     * @param grid The treasure map.
     * @param memo The memoization table to store computed results.
     * @return The maximum length of the V-shaped path starting from (i, j) with the given state.
     */
    private int dfs(int i, int j, int dir, int canTurn, int target, int[][] grid, int[][][] memo) {
        i += DIRS[dir][0]; 
        j += DIRS[dir][1]; 
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != target) {
            return 0;
        }
        int state = (dir << 1) | canTurn;
        if (memo[i][j][state] != 0) {
            return memo[i][j][state]; 
        }
     
        int res = dfs(i, j, dir, canTurn, 2 - target, grid, memo);

        if (canTurn == 1) {
            int nextDir = (dir + 1) % 4;
            res = Math.max(res, dfs(i, j, nextDir, 0, 2 - target, grid, memo));
        }
        return memo[i][j][state] = res + 1;
    }
}