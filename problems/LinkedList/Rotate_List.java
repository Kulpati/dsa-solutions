public class Rotate_List{
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if(k%size==0){return head;}
        k = k % size;
        ListNode tp = head;
        int x = 1;
        while (x < size - k) {
            tp = tp.next;
            x++;
        }
        ListNode newhead=tp.next;
        tp.next=null;
        ListNode tm=newhead;
        while(tm.next!=null){
            tm=tm.next;
        }
        tm.next=head;

        return newhead;

    }
}
}