/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
         // Create dummy nodes for 0s, 1s, and 2s
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        // Create tail pointers to add new nodes in respective lists
        Node zeroTail = zeroDummy;
        Node oneTail = oneDummy;
        Node twoTail = twoDummy;
        
        Node current = head;
        while(current!=null){
            if(current.data == 0){
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            }
            else if(current.data == 1){
                oneTail.next = current;
                oneTail = oneTail.next;
            }
            else{
                twoTail.next = current;
                twoTail = twoTail.next;
            }
            current = current.next;
        }
        
        if(oneDummy.next != null){
            zeroTail.next = oneDummy.next;
        }
        else{
            zeroTail.next = twoDummy.next;
        }
        oneTail.next = twoDummy.next;
        twoTail.next = null;
        
        
        head = zeroDummy.next;
        return head;
        
    }
}