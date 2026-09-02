package Recursion;

/**
 * Reverse_Pairs
 */
public class Reverse_Pairs {

    class Solution {
    int count;

    private void divide(int[] nums, int left, int right) {
        if (left>= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        divide(nums, left, middle);
        divide(nums, middle + 1, right);
        merge(nums, left, middle, right);
    }

    private void merge(int nums[], int left, int middle, int right) {
        int leftindex = left;
        int rightindex = middle + 1;
        while (leftindex <= middle && rightindex <= right) {
            if (nums[leftindex] > 2 * (long)(nums[rightindex])) {
                count += middle - leftindex + 1;
                rightindex++;
            } else {
                leftindex++;
            }
        }
       
        leftindex = left;
        rightindex = middle+1;
        int index = 0;
        int temp[] = new int[right - left + 1];
        while (leftindex <= middle && rightindex <= right) {
            if (nums[leftindex] <= nums[rightindex]) {
                temp[index++] = nums[leftindex++];
            } else {
                temp[index++] = nums[rightindex++];
            }
        }
        while (leftindex <= middle) {
            temp[index++] = nums[leftindex++];
        }
        while (rightindex <= right) {
            temp[index++] = nums[rightindex++];
        }
        for (int idx = left; idx <= right; idx++) {
            nums[idx] = temp[idx - left];
        }
    }

    public int reversePairs(int[] nums) {
        count =0;   
        divide(nums,0,nums.length-1);
        return count;
    }
}
}