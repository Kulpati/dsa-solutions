package Recursion;
import java.util.*;
public class House_Robber{
class Solution {
    int[] dp;

    private int func(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
  
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = Math.max(nums[i] + func(nums, i + 2), func(nums, i + 1));
        return dp[i];
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return func(nums, 0);
    }
}
}