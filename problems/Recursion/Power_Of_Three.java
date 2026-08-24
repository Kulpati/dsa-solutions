class Solution {
    private boolean recur(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return recur(n / 3);
    }
    public boolean isPowerOfThree(int n) {
        if(n==0){return false;}
        return recur(n);
    }
}