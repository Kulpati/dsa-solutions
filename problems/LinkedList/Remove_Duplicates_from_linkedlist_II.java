public class Remove_Duplicates_from_linkedlist_II {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode b=dummy;
        while(temp!=null){
            ListNode tp=temp.next;
            if(tp!=null && temp.val==tp.val){
                while(tp!=null && temp.val==tp.val){
                    tp=tp.next;
                }
                temp=tp;
            }else{
                b.next=temp;
                temp=temp.next;
                b=b.next;
            }
        }
        b.next=null;
    return dummy.next;}
}
}
