class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> ne=new HashSet<>();
        for(int[] p: friendships){
            int u=p[0]-1, v=p[1]-1;
            boolean ok=false;
            for(int x: languages[u]){
                for(int y: languages[v]){
                    if(x==y){
                        ok=true;
                        break;
                    }
                }
                if(ok) break;
            }
            if(!ok){
                ne.add(u);
                ne.add(v);
            }
        }
        int a=languages.length+1;
        for(int i=1; i<=n; ++i){
            int cans=0;
            for(int v: ne){
                boolean f=false;
                for(int c: languages[v]){
                    if(c==i){
                        f=true;
                        break;
                    }
                }
                if(!f) cans++;
            }
            a=Math.min(a, cans);
        }
        return a;
    }
}