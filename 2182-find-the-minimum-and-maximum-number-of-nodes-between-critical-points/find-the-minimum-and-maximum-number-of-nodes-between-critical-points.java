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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode previous=head;
        ListNode current=head.next;   
        ListNode forward=head.next.next;
        int n =0, index=1;
        int min_distance =Integer.MAX_VALUE;
        int FirstTc=0,LastTc=0,PreviousTc=0;
        while(forward!=null){
          if((current.val>forward.val&& current.val>previous.val) || (current.val<forward.val && current.val<previous.val))
          {
            n++;
            if(n==1) {FirstTc=LastTc=PreviousTc = index;}
            if(n==2) {LastTc=index; min_distance=LastTc-PreviousTc;}
            if(n>2){ PreviousTc=LastTc;LastTc=index;
                 if(min_distance>LastTc-PreviousTc) min_distance= LastTc-PreviousTc;
            
            } 
          } 
            previous=current;
            current=forward;
            forward=forward.next;
            index++;

          

        } if (n<2) return new int [] {-1,-1};
        int []ans={min_distance,LastTc-FirstTc};
        return ans;
        
    }
}