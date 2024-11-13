import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            int leftIndex = lowerBound(nums, i + 1, n, lower - nums[i]);
            int rightIndex = upperBound(nums, i + 1, n, upper - nums[i]);
            count += (rightIndex - leftIndex);
        }
        
        return count;
    }

    // Find the first index where nums[index] >= target
    private int lowerBound(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }

    // Find the first index where nums[index] > target
    private int upperBound(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
