class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int num: arr){
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int a=-1;
        for(int i:m.keySet()){
            if(i==m.get(i)){
                if(a<i){
                    a=i;
                }
            }
        }
        return a;
    }
}