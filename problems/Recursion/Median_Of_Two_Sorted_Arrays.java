package Recursion;

public class Median_Of_Two_Sorted_Arrays {
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = m;
        int required = (nums1.length + nums2.length + 1) / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int leftA = Integer.MIN_VALUE;
            int rightA = Integer.MAX_VALUE;
            int leftB = Integer.MIN_VALUE;
            int rightB = Integer.MAX_VALUE;
            if (mid > 0) {
                leftA = nums1[mid - 1];
            }
            if (mid < m) {
                rightA = nums1[mid];
            }
            int remaining = required - mid;
            if (remaining > 0) {
                leftB = nums2[remaining - 1];
            }
            if (remaining < n) {
                rightB = nums2[remaining];
            }
            if (leftA <= rightB && leftB <= rightA) {
                int leftmid = Math.max(leftA, leftB);
                if ((m + n) % 2 == 0) {
                    return (leftmid + Math.min(rightA, rightB)) / 2.0;
                }
                return leftmid;
            } else if (leftA > rightB) {
                high = mid - 1;
            } else if (leftB > rightA) {
                low = mid + 1;
            }
        }
        return 0.0;
    }
}
    
}