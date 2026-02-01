/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        //empty of length 1 linked list
        if(head == null || head.next == null){
            return head;
        }
        Node priorNode = null;
        Node currentNode = head;
        while(currentNode != null){
            priorNode = currentNode.prev;  // update priorNode to be just previous to current
            currentNode.prev = currentNode.next;  // current->prev will point to next node now
            currentNode.next = priorNode;      //current->next will point to previous node
            
            
            //Move the to the next node in the original which means go to where prev is pointing
            currentNode = currentNode.prev;
        }  
            
        //update the head to point to the last Node that was brought to the start from the end
        //previous of previous node (actually next of previous node)
        head = priorNode.prev;
            
            
            
        return head;
        
        
    }
}