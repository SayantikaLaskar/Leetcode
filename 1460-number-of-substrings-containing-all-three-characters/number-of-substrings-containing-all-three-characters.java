class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        int[] a=new int[3];
        int i=n-1, j=n-1;
        while(i>=0 && j>=0){
            a[s.charAt(i)-'a']++;
            while(a[0]>0 && a[1]>0 && a[2]>0){
                c+=i+1;
                a[s.charAt(j)-'a']--;
                j--;
            }
            i--;
        }
        return c;
    }
}