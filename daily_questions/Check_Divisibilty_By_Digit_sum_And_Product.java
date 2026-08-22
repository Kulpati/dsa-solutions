public class Check_Divisibilty_By_Digit_sum_And_Product {

    class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pr = 1;
        int tp=n;
        while (tp > 0) {
            int r = tp % 10;
            tp = tp / 10;
            sum += r;
            pr *= r;
            

        }
        sum += pr;
        return (n % sum == 0) ;
    }
}
}