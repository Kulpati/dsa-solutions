public class Smallest_Missing_Multiple_of_K {
   class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int n=k;
        while(map.containsKey(n)){
            n=n+k;
        }

    return n;}
}
    
}