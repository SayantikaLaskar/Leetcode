class Solution {
    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> p=new HashMap<>();
        int c=0;
        for(int i=0; i<nums.length; i++){
            for(int j: p.getOrDefault(nums[i], new ArrayList<>())){
                if((i*j)%k==0){
                    c++;
                }
            }
            p.computeIfAbsent(nums[i], x->new ArrayList<>()).add(i);
        }
        return c;
    }
}