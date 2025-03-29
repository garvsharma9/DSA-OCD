// TC: O(N)
// SC: O(1)
public class Deleteindll {
    public Node deleteNode(Node head, int x) {
        Node temp=head;
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        for(int i=1;i<x;i++)
        {
            temp=temp.next;
        }
        if(temp.next!=null)
        {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        else
        temp.prev.next=null;
        return head;
    }
}
