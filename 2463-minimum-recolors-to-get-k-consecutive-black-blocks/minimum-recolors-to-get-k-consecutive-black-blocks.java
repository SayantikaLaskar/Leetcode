class Solution {
    public int minimumRecolors(String blocks, int k) {
        int b=0, ans=Integer.MAX_VALUE;
        for(int i=0; i<blocks.length(); i++){
            if(i-k>=0 && blocks.charAt(i-k)=='B') b--;
            if(blocks.charAt(i)=='B') b++;
            ans=Math.min(ans, k-b);
        }
        return ans;
    }
}