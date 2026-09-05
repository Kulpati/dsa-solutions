package LinkedList;

public class Maximum_Twin_Sum_of_a_Linked_List {

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=fast;
        ListNode curr=slow;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int max=0;
        ListNode temp=head;
        while(prev!=null){
            max=Math.max(max,prev.val+temp.val);
            prev=prev.next;
            temp=temp.next;
        }

    return max;}
}
}
