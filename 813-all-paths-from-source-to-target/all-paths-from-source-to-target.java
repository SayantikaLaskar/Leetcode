class Solution {
    List<List<Integer>> r=new ArrayList<>();
    public void dfs(int[][] g, int s, int t, List<Integer> te){
        te.add(s);
        if(s==t){
            r.add(new ArrayList<>(te));
            te.remove(te.size()-1);
            return;
        }
        for(int i=0; i<g[s].length; i++){
            dfs(g, g[s][i], t, te);
        }
        te.remove(te.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int v=graph.length;
        List<Integer> t=new ArrayList<>();
        dfs(graph, 0, v-1, t);

        return r;
    }
}