class Solution {
    public int findNumbers(int[] nums) {
        int m = 0;
        for (int num : nums) {
            int c = 0;
            while (num != 0) {
                num /= 10;
                c++;
            }
            if (c % 2 == 0) {
                m++;
            }
        }
        return m;
    }
}
