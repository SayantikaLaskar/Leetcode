class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> c=new HashMap<>();
        for(int n:nums){
            c.put(n, c.getOrDefault(n, 0)+1);
        }
        for(int co:c.values()){
            if(co%2!=0){
                return false;
            }
        }
        return true;
    }
}