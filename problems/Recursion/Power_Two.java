package Recursion;
/**
 * Power_Two
 */
public class Power_Two {

    

class Solution {
    private boolean recur(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        
        return recur(n>>1);
    }
    public boolean isPowerOfTwo(int n) {
        if(n==0){return false;}
        return recur(n);
    }
}
}