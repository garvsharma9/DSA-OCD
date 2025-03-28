public class _237_DeleteNodeinaLinkedList{
    // SC: O(1)
    // TC: O(N)
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode prev=node;
            while(node.next!=null)
            {
                prev=node;
                node.val=node.next.val;
                node=node.next;
            }
            prev.next=null;
        }
    }
}