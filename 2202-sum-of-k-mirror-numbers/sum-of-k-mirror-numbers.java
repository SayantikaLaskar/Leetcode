class Solution {
    long createp(long n, boolean o){
        long x=n;
        if(o) x/=10;
        while(x>0){
            n=n*10+x%10;
            x/=10;
        }
        return n;
    }
    boolean isp(long n, int b){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append((char)(n%b+'0'));
            n/=b;
        }
        String s=sb.toString();
        int i=0, j=s.length()-1;
        while(i<j) if (s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public long kMirror(int k, int n) {
        long s=0;
        for(long l=1; n>0; l*=10){
            for(long i=l; n>0 && i<l*10; i++){
                long p=createp(i, true);
                if(isp(p, k)){
                    s+=p;
                    n--;
                }
            }
            for(long i=l; n>0 && i<l*10; i++){
                long p=createp(i, false);
                if(isp(p, k)) {
                    s+=p;
                    n--;
                }
            }
        }
        return s;
    }
}