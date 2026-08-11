public class Reverse_Nodes_in_Even_Length_Group {
  
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
   }
 
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode start=head;
        int group=2;
        while(start!=null){
            int size=0;
            ListNode end=start.next;
            while(end!=null && size<group){
                end=end.next;
                size++;
            }
            if(size%2==0){
                ListNode temp=start.next;
                ListNode curr=start.next;
                ListNode prev=end;
                while(curr!=end){
                    ListNode next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }
                start.next=prev;
                start=temp;
            }else{
                for(int i=0;i<size;i++){
                    start=start.next;
                }
            }
            group++;
        }
    return head;}
}
}
