package Recursion;

/**
 * Kth_Largest_Element_in_an_Array
 */
public class Kth_Largest_Element_in_an_Array {

    class Solution {
    private int[] kdivide(int [] nums,int l,int r,int k){
        if(l==r){
            return new int[]{nums[l]};
        }
        int m=l+(r-l)/2;
        int left[]=kdivide(nums,l,m,k);
        int right[]=kdivide(nums,m+1,r,k);
        return merge(left,right,k);
    }
    private int[] merge(int[] left,int[] right,int k){
        int m=left.length;
        int n=right.length;
        int len=m+n;
        if(m+n>k){
            len=k;
        }
        int i=0;
        int j=0;
        int newArray[]=new int[len];
        int l=0;
        while(i<left.length && j<right.length && l<newArray.length){
            if(left[i]>=right[j]){
                newArray[l++]=left[i++];
            }else{
                newArray[l++]=right[j++];
            }
        }
        while(i<left.length && l<newArray.length){
            newArray[l++]=left[i++];
        }
        while(j<right.length && l<newArray.length){
            newArray[l++]=right[j++];
        }
        return newArray;
    }
    public int findKthLargest(int[] nums, int k) {
        int arr[]= kdivide(nums, 0, nums.length-1, k);
        return arr[arr.length-1];
    }
}
}