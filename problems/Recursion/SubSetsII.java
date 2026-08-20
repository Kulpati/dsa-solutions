public class SubSetsII{
   class Solution {
    List<List<Integer>> result ;
    private void func(int st,int[] nums,List<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i=st;i<nums.length;i++){
            if(i>st && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            func(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(0,nums,list);
        return result;
    }
}
}