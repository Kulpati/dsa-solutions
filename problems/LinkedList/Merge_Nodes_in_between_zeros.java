package LinkedList;

public class Merge_Nodes_in_between_zeros {
    
 
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode dm=new ListNode();
        ListNode nn=dm;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;
            if(temp.val==0){
                nn.next=new ListNode(sum);
                sum=temp.val;
                nn=nn.next;
            }
            temp=temp.next;
        }
   return dm.next; }
}
}
