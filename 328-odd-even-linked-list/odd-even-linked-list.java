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
    public ListNode oddEvenList(ListNode head) {
        ListNode i = head;
        ListNode d1= new ListNode(1);
        ListNode d2= new ListNode(1);
        ListNode t1=d1;
        ListNode t2=d2;
        int j=1;
        while(i!=null)
        {
            if(j%2!=0){
                t1.next = i;
                t1 = t1.next;
                i = i.next;
                j++;
            }
            else{  t2.next = i;
                t2 = t2.next;
                i = i.next;
                j++;
            }
        } t2.next=null;
        t1.next=d2.next;
        return d1.next;
    }
}