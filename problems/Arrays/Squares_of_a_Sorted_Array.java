package Arrays;


public class Squares_of_a_Sorted_Array {

    

class Solution {
    public int[] sortedSquares(int[] nums) {
        int lf=0;
        int rg=nums.length-1;
        int res[]=new int[nums.length];
        int id=res.length-1;
        while(lf<=rg){
            int n1=nums[lf];
            int n2=nums[rg];
            if(n1<0){n1*=-1;}
            if(n2<0){n2*=-1;}
            if(n2>n1){
                res[id--]=n2*n2;
                rg--;
            }else{
                res[id--]=n1*n1;
                lf++;
            }
            
        }
        
    return res;}
}
}