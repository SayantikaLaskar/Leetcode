import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Count frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
        // Count how many elements have the maximum frequency
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                count += freq; // Add the frequency count for each element
            }
        }
        
        return count;
    }
}