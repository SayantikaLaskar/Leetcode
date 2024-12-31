class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> fm=new HashMap<>();
        Set<Integer> fs=new HashSet<>();
        for(int e:arr){
            fm.put(e, fm.getOrDefault(e, 0)+1);
        }
        for(int f: fm.values()){
            fs.add(f);
        }
        return fm.size()==fs.size();
    }
}