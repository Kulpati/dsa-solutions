package Recursion;
import java.util.*;

class Permutation {
 class Solution {
    List<List<Integer>> re;
    private void func(int[] nums,List<Integer> list,boolean[] used){
        if(list.size()==nums.length){
            re.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<used.length;i++){
            if(used[i]){continue;}
            list.add(nums[i]);
            used[i]=true;
            func(nums,list,used);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean used[]=new boolean[nums.length];
        Arrays.fill(used,false);
        re=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(nums,list,used);
        return re;
    }
}
    
}