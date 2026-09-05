package LinkedList;
import java.util.*;

class Node{
    int val;
    Node next;
    Node random;
    Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }

}

public class Copy_List_With_Random_Pointer{
    class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){return head;}
        HashMap<Node,Node> map=new HashMap<>();
        Node newhead=new Node(head.val);
        map.put(head,newhead);
        Node temp=head.next;
        Node tp=newhead;
        while(temp!=null){
            tp.next=new Node(temp.val);
            tp=tp.next;
            map.put(temp,tp);
            temp=temp.next;
        }
        tp.next=null;
        Node tm=head;
        Node dm=newhead;
        while(tm!=null){
            dm.random=map.get(tm.random);
            dm=dm.next;
            tm=tm.next;
        }
    return newhead;}
}
}