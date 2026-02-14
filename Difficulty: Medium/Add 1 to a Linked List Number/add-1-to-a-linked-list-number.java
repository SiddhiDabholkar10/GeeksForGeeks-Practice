/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverseList(Node head){
        
        
        Node prev = null;
        Node current = head;
        while(current!=null){
            Node front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
        
    }
    public Node addOne(Node head) {
        // code here.
        head=reverseList(head);
        Node current = head;
        int carry = 1;
        while(current!=null && carry>0){
            int sum = current.data = current.data + carry;
            current.data = sum % 10;
            carry = sum/10;
             // If there's no next node and we still have a carry, append a new node
            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                carry = 0;  
            }
             current = current.next;
            
        }
        head = reverseList(head);
        return head;
       
           
    }
}