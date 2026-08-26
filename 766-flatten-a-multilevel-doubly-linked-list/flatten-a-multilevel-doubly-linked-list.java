/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            if(temp.child==null) temp=temp.next;
            else{
                Node fwd=temp.next;
                Node c = temp.child;
                temp.child=null;
                c=   flatten(c);
                temp.next=c;
                c.prev=temp;
                Node t=c;
                while(t.next!=null ) t=t.next;
                    t.next=fwd;
                  if(fwd!=null)  fwd.prev=t;

               temp=fwd;

            }
        } return head;
    }
}