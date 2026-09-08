package Trees;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

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
    List<List<Integer>> result=new ArrayList<>();
    private void func(TreeNode root,int targetSum,List<Integer> path){
        if(root==null){return;}
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                result.add(new ArrayList<>(path));
            }
            path.remove(path.size()-1);
            return ;
        }
        func(root.left,targetSum-root.val,path);
        func(root.right,targetSum-root.val,path);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        func(root,targetSum,new ArrayList<>());
        return result;
    }
}
}
