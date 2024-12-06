class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr=new int[10001];
        for(int i=0; i<banned.length; i++){
            arr[banned[i]]=1;
        }
        long s=0;
        int c=0;
        for(int i=1; i<=n; i++){
            if(arr[i]==1) continue;
            s+=i;
            if(s>maxSum){
                break;
            }
            c++;
        }
        return c;
    }
}