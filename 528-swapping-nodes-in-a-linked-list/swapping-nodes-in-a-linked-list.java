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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i =0;i<k-1;i++)
        {temp=temp.next;}
        ListNode slow=head;
        ListNode fast =temp.next;
        while(fast!=null){
           slow= slow.next;
           fast = fast.next;
        } int x=temp.val;
        temp.val=slow.val;
        slow.val=x;
        return head;
    }
}