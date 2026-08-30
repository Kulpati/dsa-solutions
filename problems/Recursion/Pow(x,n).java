package Recursion;

class Pow(x,n) {

    class Solution {
    private double func(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        double ans = func(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        } else if (n < 0 && n % 2 == -1) {
            return ans * ans * (1 / x);
        } else {
            return ans * ans * x;
        }
    }

    public double myPow(double x, int n) {
        return func(x, n);
    }
}
}