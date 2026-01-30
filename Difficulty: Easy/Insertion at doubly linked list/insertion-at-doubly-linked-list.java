/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        int key=0;
        Node curr = head;
        while(curr!=null){
            if(key==p){
                break;
            }
            curr = curr.next;
            key++;
        }
        if(curr == null){  //index not found
            return head;
        }
        Node new_Node = new Node(x);
        new_Node.prev =  curr;
        new_Node.next = curr.next;
        curr.next = new_Node;
        if(new_Node.next!=null){
            new_Node.next.prev = new_Node;
        }
        return head;
        
    }
}