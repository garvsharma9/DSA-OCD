// TC: O(N)
// SC: O(1)
public class search_ll {
    static boolean searchKey(int n, Node head, int key) {
        Node temp=head;
        for(int i=0;i<n;i++)
        {
          if(temp.data==key)
          return true;
          temp=temp.next;
        }
        return false;
    }
}
