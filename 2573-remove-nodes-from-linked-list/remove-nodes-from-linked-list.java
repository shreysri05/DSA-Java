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
    ListNode reverse(ListNode head){
        
        ListNode p =null;
        ListNode c =head;
        while(c!=null){
            ListNode f =c.next;
            c.next=p;
            p=c;
            c=f;}
            return p;
    }
    public ListNode removeNodes(ListNode head) {
        if(head.next==null) return head;
       head= reverse(head);
       ListNode t=head;
       while(t!=null&&t.next!=null){
        if(t.val>t.next.val) {t.next=t.next.next;}
        else t=t.next;
       }
        return reverse(head);
       

        
    }
}