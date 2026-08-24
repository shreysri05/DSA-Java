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
        ListNode p=null;
        ListNode c =head;
        while(c!=null){
            ListNode f = c.next;
            c.next=p ;
            p=c;
            c=f;
        } return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1==null &&l2!=null) return l2;
        if(l1!=null &&l2==null) return l1;
        if(l1!=null && l2!=null){
        l1= reverse(l1);
        l2=reverse(l2);}
        int carry =0;
        ListNode d = new ListNode(-1);
        ListNode t=d;
        while(l1!=null||l2!=null||carry!=0){
            int n =0,m=0;
            if (l1!=null){ n =l1.val; l1=l1.next;}
            if (l2!=null) { m=l2.val;l2=l2.next;}
            
            int sum = n+m+carry;
             carry=sum/10;
             sum=sum%10;
             ListNode a = new ListNode(sum);
             t.next=a;
             t=t.next;

        } return reverse(d.next);

    }
}