public class Odd_Even_LinkedList {
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode tp = head.next;
        ListNode even = tp;
        ListNode temp = head.next.next;
        while (temp != null) {
            odd.next = temp;
            odd = odd.next;
            temp = temp.next;

            if (temp != null) {
                even.next = temp;
                even = even.next;
                temp = temp.next;
            }
        }
        even.next = null;
        odd.next = tp;
        return head;
    }
}
}
