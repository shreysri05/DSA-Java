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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right) return head;
        ListNode d=new ListNode(-1);
        d.next=head;
        ListNode L =d;
        ListNode R = d;
        while(right>0)
        {
            if(left>1){
                L=L.next;
                left--;}
            R=R.next;
            right--;
        }
        ListNode p=L;
        L=L.next;
        ListNode f= R.next;
        ListNode C=L;R.next=null;

        while(L!=null){
        L=L.next;
        C.next=f;
        f=C;
        C=L;
        }
        p.next=R;
            return d.next;
        
    }
}