class Solution {
    public int minimumDeletions(String word, int k) {
       int[] f=new int[26];
       for(char ch: word.toCharArray()){
        f[ch-'a']++;
       } 
       Arrays.sort(f);
       int r=Integer.MAX_VALUE;
       int d=0;
       for(int i=0; i<26; i++){
        int m=f[i];
        int t=d;
        for(int j=25; j>i; j--){
            if(f[j]-f[i]<=k)
                break;
            t+=f[j]-m-k;
        }
        r=Math.min(r, t);
        d+=m;
       }
       return r;
    }
}