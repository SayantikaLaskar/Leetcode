class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int k=(int)Arrays.stream(nums).distinct().count(), r=0;
        for(int i=0; i<nums.length; i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i; j<nums.length; j++){
                s.add(nums[j]);
                if(s.size()==k) r++;
            }
        }
        return r;
    }
}