package LinkedList;

public class Add_Two_Number{
 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dm = new ListNode(0);
       ListNode tp=dm;
       int c=0;
       while(l1!=null || l2!=null || c!=0){
        int digit=0;
        if(l1!=null){
            digit=digit+l1.val;
              l1=l1.next;
        }
        if(l2!=null){
            digit=digit+l2.val;
            l2=l2.next;
        }
        if(c!=0){
            digit=digit+c;
        }
        c=digit/10;
       int re=digit%10;
        tp.next= new ListNode(re);
        tp=tp.next;
      
        
        
       }
    return dm.next;}
}
}