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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;

     ListNode temp = head;
     while(temp!=null) {
         temp=temp.next;
        n++;
     }  
      temp =head;
     for(int i=1;i<n/2;i++){
     temp=temp.next;

     } if (temp==null && temp.next==null|| n==1) return null;
     temp.next=temp.next.next;
     return head;
    }
}