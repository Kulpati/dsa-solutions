 public class Palindrome_LinkedList{
 class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode tp=head;
        while(prev!=null){
            if(tp.val!=prev.val){
                return false;
            }
            tp=tp.next;
            prev=prev.next;
        }
   return true; }
}
 }