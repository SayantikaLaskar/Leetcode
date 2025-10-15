import java.util.List;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n < 2) return 0;

        // Precompute an array that tracks strictly increasing elements
        boolean[] isIncreasing = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                isIncreasing[i] = true;
            }
        }

        // Binary search to find the maximum possible k
        int left = 1, right = n / 2, maxK = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValidK(isIncreasing, mid)) {
                maxK = mid; // Update the maximum k found
                left = mid + 1; // Try to find a larger k
            } else {
                right = mid - 1; // Reduce the search space
            }
        }

        return maxK;
    }

    private boolean isValidK(boolean[] isIncreasing, int k) {
        int n = isIncreasing.length;
        int count1 = 0, count2 = 0;

        // Check if there's a valid set of adjacent subarrays of length k
        for (int i = 0; i < k - 1; i++) {
            if (isIncreasing[i]) count1++;
        }
        for (int i = k; i < 2 * k - 1; i++) {
            if (i < n && isIncreasing[i]) count2++;
        }

        for (int i = 0; i <= n - 2 * k + 1; i++) {
            if (count1 == k - 1 && count2 == k - 1) {
                return true;
            }

            // Slide the window to the right
            if (i + k - 1 < n && isIncreasing[i + k - 1]) count1++;
            if (i < n && isIncreasing[i]) count1--;
            if (i + 2 * k - 1 < n && isIncreasing[i + 2 * k - 1]) count2++;
            if (i + k < n && isIncreasing[i + k]) count2--;
        }

        return false;
    }
}
