public class LinkedListInsertionAtEnd {
    //TC: O(N)
    // SC:O(1)
    class Solution {
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            Node newnode = new Node(x);
            if(head==null)
            {
                head=newnode;
                return head;
            }
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            return head;
        }
    }
}
