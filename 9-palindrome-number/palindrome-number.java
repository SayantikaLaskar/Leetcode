class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r=0, y=x;
        while(x>0){
            r=(r*10)+(x%10);
            x/=10;
        }
        return r==y;
    }
}