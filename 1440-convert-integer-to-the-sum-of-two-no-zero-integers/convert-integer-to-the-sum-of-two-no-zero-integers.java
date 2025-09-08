class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (isNoZero(i) && isNoZero(j)) {
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        
        return result;
    }
    
    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}