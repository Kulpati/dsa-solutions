package LinkedList;

public class Reverse_Nodes_in_k_Group {
    
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp!=null){
            ListNode end=temp.next;
            int size=0;
            while(end!=null && size<k){
                end=end.next;
                size++;
            }
            if(size<k){break;}
            ListNode prev=end;
            ListNode start=temp.next;
            ListNode curr=start;
            
            for(int i=0;i<k;i++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                
            }
            temp.next=prev;
            temp=start;
        }
   return dummy.next; }
}
}
