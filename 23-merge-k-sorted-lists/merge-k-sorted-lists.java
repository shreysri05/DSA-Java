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
    ListNode divide(ListNode[] lists,int start,int end){
        if(start==end) return lists[start];
        int low=start,high=end;
        int mid=low+(high-low)/2;
            ListNode l1= divide(lists,low,mid);
            ListNode l2= divide(lists,mid+1,high);
            return  merge(l1,l2);
        
    }
    ListNode merge(ListNode head1,ListNode head2){
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while( head1!=null&&head2!=null) {
            if(head1.val> head2.val){
                t.next=head2;
                t=t.next;
                head2=head2.next;
            }
            
            else{
                t.next=head1;
                t=t.next;
                head1=head1.next;

            }}

            if(head1!=null) t.next=head1;
            if(head2!=null)t.next=head2;

        return d.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
       
      return  divide(lists,0,lists.length-1);

    }
}