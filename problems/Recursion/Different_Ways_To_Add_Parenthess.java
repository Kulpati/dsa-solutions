package Recursion;
import java.util.*;;

public class Different_Ways_To_Add_Parenthess {
    class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        if(expression.length()<=2){
            int num=Integer.parseInt(expression);
            result.add(num);
            return result;
            
        }
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+' || expression.charAt(i) == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1, expression.length()));
                for (int k = 0; k < left.size(); k++) {
                    for (int j = 0; j < right.size(); j++) {
                        if (expression.charAt(i) == '*') {
                            result.add(left.get(k) * right.get(j));
                        } else if (expression.charAt(i) == '+') {
                            result.add(left.get(k) + right.get(j));
                        } else {
                            result.add(left.get(k) - right.get(j));
                        }
                    }
                }
               
            }
        }
        
        return result;
    }
}
}
