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
    public boolean isPalindrome(ListNode head) {
        ListNode slow =head;
        ListNode fast= head;
        ListNode previous=null;
        ListNode forward=null;
        while(fast.next!=null&& fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        } ListNode head2=slow.next;
        slow.next=null;
        ListNode current =head2;
        while(current!=null)
        {
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;
        }
        while(head!=null && previous!=null)
        {
            if(head.val!=previous.val) return false;
            head=head.next;
            previous=previous.next;
            
        } return true;
    }
}