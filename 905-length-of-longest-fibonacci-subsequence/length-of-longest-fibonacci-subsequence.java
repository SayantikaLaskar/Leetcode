class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        final int n=arr.length;
        int a=0;
        int[][] dp=new int[n][n];
        Arrays.stream(dp).forEach(A->Arrays.fill(A, 2));
        Map<Integer, Integer> nt=new HashMap<>();
        for(int i=0; i<n; i++)
            nt.put(arr[i], i);
        for(int j=0; j<n; j++)
            for(int k=j+1; k<n; k++){
                final int ai=arr[k]-arr[j];
                if(ai<arr[j] && nt.containsKey(ai)){
                    final int i=nt.get(ai);
                    dp[j][k]=dp[i][j]+1;
                    a=Math.max(a, dp[j][k]);
                }
            }
            return a;
    }
}