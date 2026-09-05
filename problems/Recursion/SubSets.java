package Recursion;
import java.util.*;
public class SubSets{
    class Solution {
    List<List<Integer>> re;
    private void func(int i,int[] nums,List<Integer> list){
        re.add(new ArrayList<>(list));
        for(int j=i;j<nums.length;j++){
            list.add(nums[j]);
            func(j+1,nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        re=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(0,nums,list);
        return re;
    }
}
}