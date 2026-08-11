public class Merge_k_Sorted_Lists{
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> p=new PriorityQueue<>(Comparator.comparingInt(a->a.val));
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
            p.offer(lists[i]);}
        }
        ListNode dummy=new ListNode();
        ListNode tp=dummy;
        while(!p.isEmpty()){
            ListNode temp=p.poll();
            tp.next=new ListNode(temp.val);
            if(temp.next!=null){
            p.offer(temp.next);}
            tp=tp.next;
        }
    return dummy.next;}
}
}