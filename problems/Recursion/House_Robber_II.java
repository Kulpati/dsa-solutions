public class House_Robber_II{
  class Solution {
    int dp[];

    private int func(int[] nums, int i, int n) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = Math.max(nums[i] + func( nums,i+2, n), func( nums,i+1, n));
        return dp[i];
    }

    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int val = func(nums, 0, nums.length - 1);
        Arrays.fill(dp, -1);
        return Math.max(val, func(nums, 1, nums.length));
    }
}
}