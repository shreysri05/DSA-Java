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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=null;
        ListNode f=null;
        int sum =0;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode c=head2;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        while(head!=null){
           if((head.val+p.val)>sum) sum =head.val+p.val;
            head=head.next;
            p=p.next;

           
        } return sum;
    }
}