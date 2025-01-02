class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] p=new int[n+1];
        Set<Character> v=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i<n; i++){
            p[i+1]=p[i];
            if(v.contains(words[i].charAt(0)) && v.contains(words[i].charAt(words[i].length()-1))){
                p[i+1]++;
            }
        }
        int[] a=new int[queries.length];
        for(int i=0; i<queries.length; i++){
            a[i]=p[queries[i][1]+1]-p[queries[i][0]];
        }
        return a;
    }
}