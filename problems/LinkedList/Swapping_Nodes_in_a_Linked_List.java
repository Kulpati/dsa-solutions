package LinkedList;
public class Swapping_Nodes_in_a_Linked_List {
     class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<k;i++){
            fast=fast.next;
         }
        ListNode temp=fast;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int tp=temp.val;
        temp.val=slow.val;
        slow.val=tp;

   return dummy.next; }
}
}
