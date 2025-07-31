class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ro=new HashSet<>();
        Set<Integer> co=new HashSet<>();
        for(int x:arr){
            Set<Integer> no=new HashSet<>();
            no.add(x);
            for(int y: co){
                no.add(x|y);
            }
            ro.addAll(no);
            co=no;
        }
        return ro.size();
    }
}