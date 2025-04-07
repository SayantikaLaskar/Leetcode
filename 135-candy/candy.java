class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int t=n;
        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int c=0;
            while(i<n && ratings[i]>ratings[i-1]){
                c++;
                t+=c;
                i++;
            }
            if(i==n){
                return t;
            }
            int v=0;
            while(i<n && ratings[i]<ratings[i-1]){
                v++;
                t+=v;
                i++;
            }
            t-=Math.min(c, v);
        }
        return t;
    }
}