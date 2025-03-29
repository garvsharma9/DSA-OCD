// TC: O(N)
// SC: O(1)
public class reversedll {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode curr=head;
        if(curr==null)
        return null;
        DLLNode temp=null;
        while(curr.next!=null)
        {
            temp=curr.next;
            curr.next=curr.prev;
            curr.prev=temp;
            curr=curr.prev;
        }
        curr.next=curr.prev;
        curr.prev=null;
        return curr;
    }
}
