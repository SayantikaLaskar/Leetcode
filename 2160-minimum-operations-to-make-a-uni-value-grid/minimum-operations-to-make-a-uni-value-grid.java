class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> v=new ArrayList<>();
        for(int[] r:grid){
            for(int va: r){
                v.add(va);
            }
        }
        Collections.sort(v);
        for(int va:v){
            if(Math.abs(va-v.get(0))%x!=0){
                return -1;
            }
        }
        int m=v.get(v.size()/2);
        int o=0;
        for(int va:v){
            o+=Math.abs(va-m)/x;
        }
        return o;
    }
}