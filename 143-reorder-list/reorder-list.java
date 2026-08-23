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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        ListNode head2=slow.next;
        slow.next=null;
        ListNode c =head2;
        ListNode p = null;
        while(c!=null)
        {
           ListNode f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode t1=head;
        while(p!=null){
            ListNode t2=p;
            p=p.next;
            t2.next=t1.next;
            t1.next=t2;
            t1=t2.next;
        }

        
    
       
   }
}