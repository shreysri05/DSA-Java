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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode current = head;
    ListNode temp1=head;
    ListNode dummy = new ListNode(-1);
    dummy.next=head;
    ListNode t=dummy;
      int m =k;
      while(current!=null){ListNode forward=current.next;
        if(k!=1) {current=current.next;k--;}
        else{ 
            current.next=null;
            t.next=reverse(temp1);

            temp1.next=forward;
            t=temp1;
            current=forward;
            temp1=current;
            k=m; } 
      }    return dummy.next;
    }   
    ListNode reverse(ListNode head){
        
            ListNode prev=null;
            while(head!=null)
            {ListNode forward =head.next;
            head.next=prev;
            prev=head;
            head=forward;
        } return prev;
        }
}
