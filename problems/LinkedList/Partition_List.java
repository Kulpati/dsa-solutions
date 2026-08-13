public class Partition_List {
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dm1=new ListNode();
        ListNode dm2=new ListNode();
        ListNode tp1=dm1;
        ListNode tp2=dm2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                tp1.next=temp;
                tp1=tp1.next;
            }else{
                tp2.next=temp;
                tp2=tp2.next;
            }
            temp=temp.next;
        }
        tp2.next=temp;
        tp1.next=dm2.next;

    return dm1.next;}
}
}
