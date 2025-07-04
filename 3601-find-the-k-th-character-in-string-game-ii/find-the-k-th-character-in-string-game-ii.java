class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n=operations.length;
        long[] l=new long[n+1];
        l[0]=1;
        for(int i=0; i<n; i++){
            if(operations[i]==0){
                l[i+1]=Math.min(l[i]*2, (long)1e14);
            }else{
                l[i+1]=Math.min(l[i]*2, (long)1e14);
            }
        }
        int s=0;
        for(int i=n-1; i>=0; i--){
            long h=l[i];
            if(k>h){
                k-=h;
                if(operations[i]==1){
                    s++;
                }
            }
        }
        int f=('a'-'a'+s)%26;
        return (char)('a'+f);
    }
}