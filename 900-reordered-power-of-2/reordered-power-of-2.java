class Solution {
    public boolean reorderedPowerOf2(int n) {
        String t=sortd(n);
        for(int i=0; i<31; i++){
            int p=1<<i;
            if(sortd(p).equals(t)) return true;
        }
        return false;
    }
    public String sortd(int num){
        char[] a=String.valueOf(num).toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}