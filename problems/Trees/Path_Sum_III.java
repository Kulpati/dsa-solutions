package Trees;
import java.util.*;
public class Path_Sum_III{

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    HashMap<Long,Integer> map;
    int c;
    private void helper(TreeNode root,long cs,int k){
        if(root==null){
            return ;
        }
        cs+=root.val;
        if(map.containsKey(cs-k)){
            c+=map.get(cs-k);
        }
        map.put(cs,map.getOrDefault(cs,0)+1);
        helper(root.left,cs,k);
        helper(root.right,cs,k);
        map.put(cs,map.get(cs)-1);
    
    }
    public int pathSum(TreeNode root, int targetSum) {
        map=new HashMap<>();
        map.put(0L,1);
        c=0;
        helper(root,0,targetSum);
        return c;
    }
}
}