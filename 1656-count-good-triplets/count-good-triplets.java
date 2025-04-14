class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int g=0, l=arr.length;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1; k<l; k++){
                        if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                            g++;
                        }
                    }
                }
            }
        }
        return g;
    }
}