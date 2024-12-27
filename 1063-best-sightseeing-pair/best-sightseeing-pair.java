class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0; 
        int maxPrevValue = values[0]; 

        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxPrevValue + values[j] - j);
            maxPrevValue = Math.max(maxPrevValue, values[j] + j);
        }

        return maxScore;
    }
}