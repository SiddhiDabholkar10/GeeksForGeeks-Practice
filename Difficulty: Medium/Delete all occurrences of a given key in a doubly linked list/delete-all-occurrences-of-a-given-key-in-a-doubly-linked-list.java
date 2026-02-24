/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
         Node curr = head;

        while (curr != null) {
            

            if (curr.data == x) {
                // If deleting head, move head forward
                if (curr.prev == null) {
                    head = curr.next;
                } else {
                    curr.prev.next = curr.next;
                }

                // Fix back-link of next node (if it exists)
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }

                
            }

            curr = curr.next; // always advance
        }

        
        return head;
        
        
        
    }
    
} 
