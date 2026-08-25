/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null|| (head.next==null && head.val==val)) return null;
        ListNode d= new ListNode (-1);
        d.next=head;
         ListNode t=d;
        while(t.next!=null){
            if(t.next.val==val){ t.next=t.next.next;}
           else  t=t.next;  
        } return d.next;
    }
}