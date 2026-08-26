package Arrays;

public class Sort_Array {

    class Solution {
    public void mergesort(int []nums,int l,int r){
        if(l>=r){return ;}
        int m=l+(r-l)/2;
        mergesort(nums,l,m);
        mergesort(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public void merge(int[] nums,int l,int m,int r){
        int i=l;
        int j=m+1;
        int temp[]=new int[r-l+1];
        int t=0;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp[t]=nums[i];
                i++;
            }else{
                temp[t]=nums[j];
                j++;
            }
            t++;
        }
        while(i<=m){temp[t++]=nums[i++];}
        while(j<=r){temp[t++]=nums[j++];}
        int p=0;
        for(int k=l;k<=r;k++){
            nums[k]=temp[p];
            p++;
        }

    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}    
}