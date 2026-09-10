package Trees;

import java.util.*;
public class Binary_Tree_Path {

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
    List<String> result;
    private void func(TreeNode root,StringBuilder sb){
        if(root==null){
            return ;
        }
        sb.append(root.val);
        if(root.left==null && root.right==null){
            result.add(new String(sb.toString()));
            sb.deleteCharAt(sb.length()-1);
            return;
        }else{
            sb.append("->");
        }
        
        func(root.left,sb);
        func(root.right,sb);
        sb.delete(sb.length()-3,sb.length());
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        result=new ArrayList<>();
        func(root,sb);
        return result;
    }
}
    
}