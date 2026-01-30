/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        
         int key=1;
         Node curr = head;
          while(curr!=null){
            if(key==x){
                break;
            }
            curr = curr.next;
            key++;
        }
        if(curr == null){  //index not found
            return head;
        }
        if(curr != head){
            curr.prev.next = curr.next;
            
        }
        if(curr.next != null){
            curr.next.prev = curr.prev;
        }
        if(head == curr){
            head = curr.next;
        }
        return head;
        
    }
}