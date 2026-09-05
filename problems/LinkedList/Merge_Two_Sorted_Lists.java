package LinkedList;
public class Merge_Two_Sorted_Lists {
    
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                tail.next=new ListNode(l2.val);
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }else{
            tail.next=l2;
        }
   return dummy.next; }
}
}
