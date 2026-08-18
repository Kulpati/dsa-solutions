package Recursion;

public class Fibonacci {
    class Solution {
    int dp[]=new int[32];
    private int recur(int n){
        if(n<=1){return n;};
        if(dp[n]!=0){return dp[n];}
        dp[n]=recur(n-1)+recur(n-2);
        return dp[n];
    }
    public int fib(int n) {
        return recur(n);
    }
}
}
