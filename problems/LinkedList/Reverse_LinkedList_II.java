package LinkedList;

public class Reverse_LinkedList_II {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode temp=dummy;
        int x=0;
        while(temp!=null && x<left-1){
            temp=temp.next;
            x++;
        }
        ListNode end=temp.next;
        
        while(end!=null && x<right){
            end=end.next;
            x++;
        }
        ListNode prev=end;
        ListNode curr=temp.next;
        while(curr!=end){
           ListNode next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        
        temp.next=prev;

   return (left==1)?prev:head; }
}
}
}
