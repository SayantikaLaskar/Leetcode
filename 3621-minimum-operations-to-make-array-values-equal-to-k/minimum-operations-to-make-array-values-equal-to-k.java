class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            if(n<k) return -1;
            if(n>k) s.add(n);
        }
        return s.size();
    }
}