/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        if(head == null || head.next == null){
            return 0;
        }
        while(fast!= null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                
                int length = 1;
                while(fast.next != slow){
                    fast = fast.next;
                    length++;
                }
                return length;
               
            }
            
        }
        return 0;
        
    }
    
}
