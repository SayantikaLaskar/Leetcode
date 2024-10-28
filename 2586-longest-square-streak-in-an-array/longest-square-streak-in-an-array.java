class Solution {
    public int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> mp=new HashMap<>();
        Arrays.sort(nums);
        int r=-1;
        for(int num:nums){
            int s=(int)Math.sqrt(num);
            if(s*s==num && mp.containsKey(s)){
                mp.put(num, mp.get(s)+1);
                r=Math.max(r, mp.get(num));
            }else{
                mp.put(num, 1);
            }
        } 
        return r;
    }
}