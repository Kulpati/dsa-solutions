package Trees;
import java.util.*;

public class Binary_Tree_Inorder_Traversal {

   

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
    private void traversal(TreeNode root,List<Integer> result){
        if(root==null){return ;}
        traversal(root.left,result);
        result.add(root.val);
        traversal(root.right,result);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        traversal(root,result);
        return result;
    }
}
}