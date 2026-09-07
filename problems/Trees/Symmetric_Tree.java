package Trees;


public class Symmetric_Tree {

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
    private boolean check(TreeNode T1,TreeNode T2){
        if(T1==null && T2==null){
            return true;
        }
        if(T1==null || T2==null){
            return false;
        }
        if(T1.val!=T2.val){return false;}
        boolean left=check(T1.left,T2.right);
        boolean right=check(T1.right,T2.left);
        return left && right;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}
        return check(root.left,root.right);
    }
}
    
}