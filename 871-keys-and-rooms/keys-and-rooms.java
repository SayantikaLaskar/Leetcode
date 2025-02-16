class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> v=new HashSet<>();
        dfs(v, 0, rooms);
        return v.size()==rooms.size();
    }
    public void dfs(Set<Integer> v, int c, List<List<Integer>> rooms){
        v.add(c);
        for(int n: rooms.get(c)){
            if(!v.contains(n)){
                dfs(v, n, rooms);
            }
        }
    }
}