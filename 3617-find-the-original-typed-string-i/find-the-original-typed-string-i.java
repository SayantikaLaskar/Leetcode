class Solution {
    public int possibleStringCount(String word) {
        long a=1;
        for(int i=0, n=word.length();i<n;){
            int j=i;
            while(j<n && word.charAt(j)==word.charAt(i)) j++;
            a+=(j-i-1);
            i=j;
        }
        return (int)a;
    }
}