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
    public ListNode partition(ListNode head, int x) {
       if(head==null ||head.next==null) return head; 
    ListNode dummy1= new  ListNode(-1);
    ListNode dummy2= new  ListNode(-1);
    ListNode temp1= dummy1;
    ListNode temp2= dummy2;
    ListNode i =head;

    while(i!=null)
    {
        if(i.val<x) {temp1.next=i;
        temp1=temp1.next;
        i=i.next;}
        else{temp2.next=i;
        temp2=temp2.next;
        i=i.next;
        }
        
    }temp1.next=dummy2.next;
    temp2.next=null;
    return dummy1.next;

    }
}