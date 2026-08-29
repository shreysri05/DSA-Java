/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head1)
    {
        if(head1==null) return null;
        Node temp1=head1;
        
    
        Node dummy= new Node(-1);
        Node t1=dummy;

         while(temp1!=null)
         {
          Node t= temp1;
          temp1=temp1.next;
          Node temp2= new Node (t.val);
          t.next=temp2;
          temp2.next=temp1;
        }
        temp1=head1;
        Node temp2=temp1.next;
        while(temp1!=null){
        temp2=temp1.next;
        if(temp1.random==null) temp2.random=null;
         else temp2.random=temp1.random.next;  
         temp1=temp1.next.next;
        }
        temp1=head1;
        while(temp1!=null){
          temp2=temp1.next;
          t1.next=temp2;
          t1=t1.next;
          temp1.next=temp2.next;
          temp1=temp1.next;
        } temp2.next=null;
        return dummy.next;

    }
}