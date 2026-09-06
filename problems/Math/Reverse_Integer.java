package Math;
import java.util.*;


public class Reverse_Integer {
      class Solution {
    public int reverse(int x) {
        long num=Math.abs(x);
        long n=0;
        while(num>0){
            long rem=num%10;
            num=num/10;
            n=n*10+rem;
        }
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE){return 0;}
        if(x<0){
            return (int)(-1*n);
        }
        return (int)n;
    }
}
    
}