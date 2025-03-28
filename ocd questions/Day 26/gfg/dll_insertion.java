// TC: O(N)
// SC: O(1)
public class dll_insertion {
    Node addNode(Node head, int p, int x) {
        Node temp=head;
        while(p>0)
        {
            temp=temp.next;
            p--;
        }
        Node temp1=temp.next;
        Node newnode = new Node(x);
        temp.next=newnode;
        newnode.next=temp1;
        newnode.prev=temp;
        return head;
    }
}
