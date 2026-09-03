package Recursion;

/**
 * Count_of_Range_Sum
 */
public class Count_of_Range_Sum {

    class Solution {
    int count;

    private void divide(long[] nums, int lower, int upper, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        divide(nums, lower, upper, left, middle);
        divide(nums, lower, upper, middle + 1, right);
        merge(nums, lower, upper, left, middle, right);
    }

    private void merge(long[] nums, int lower, int upper, int left,int middle, int right) {
        long[] temp = new long[right - left + 1];
        int low = left;
        int high = left;

        for (int rg = middle + 1; rg <= right; rg++) {
            while (low<=middle && nums[low] < nums[rg] - upper  ) {
                low++;
            }
          
            while (  high<=middle && nums[high] <= nums[rg] - lower) {
                high++;
            }
            count += high - low;
        }
        
       
        int lf = left;
        int rg = middle + 1;
        int idx = 0;
        while (lf <= middle && rg <= right) {
            if (nums[lf] <= nums[rg]) {
                temp[idx++] = nums[lf++];
            } else {
                temp[idx++] = nums[rg++];
            }
        }
        while (lf <= middle) {
            temp[idx++] = nums[lf++];
        }
        while (rg <= right) {
            temp[idx++] = nums[rg++];
        }
        for (int index = left; index <= right; index++) {
            nums[index] = temp[index - left];
        }
    }

    public int countRangeSum(int[] nums, int lower, int upper) {
        count = 0;
        long prefix[]=new long[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=(long)prefix[i]+nums[i];
        }
        divide(prefix, lower, upper, 0, prefix.length - 1);
        return count;
    }
}
}