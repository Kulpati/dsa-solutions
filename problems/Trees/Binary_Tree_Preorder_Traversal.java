package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {

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
    
    private void func(TreeNode root,List<Integer> result){
        if(root==null){return ;}
        result.add(root.val);
        func(root.left,result);
        func(root.right,result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        func(root,result);
        return result;
    }
}
}
