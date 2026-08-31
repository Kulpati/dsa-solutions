package Recursion;

/**
 * Find_the_Kth_Largest_Integer_in_the_Array
 */
public class Find_the_Kth_Largest_Integer_in_the_Array {

    class Solution {
    private String[] divide(String[] nums,int l,int r,int k){
        if(l>=r){
            return new String[]{nums[l]};
        }
        int m=l+(r-l)/2;
        String left[]=divide(nums, l, m, k);
        String right[]=divide(nums, m+1, r,  k);
        return merge(left,right,k);
    }
    private String[] merge(String[] left,String[] right,int k){
        int len=left.length+right.length;
        if(len>k){
            len=k;
        }
        String[] newStr=new String[len];
        int s=0;
        int i=0;
        int j=0;
        while(i<left.length && j<right.length && s<newStr.length){
            if(left[i].length()>right[j].length()){
                newStr[s++]=left[i++];
            }else if(left[i].length()<right[j].length()){
                newStr[s++]=right[j++];
            }else{
                int compare=left[i].compareTo(right[j]);
                if(compare>=0){
                    newStr[s]=left[i++];
                }else{
                    newStr[s]=right[j++];
                }
                s++;
            }
        }
        while(s<newStr.length && i<left.length){
            newStr[s++]=left[i++];
        }
        while(s<newStr.length && j<right.length){
            newStr[s++]=right[j++];
        }
        return newStr;
    }
    public String kthLargestNumber(String[] nums, int k) {
        String[] re=divide(nums,0,nums.length-1,k);
        return re[re.length-1];
    }
}
}