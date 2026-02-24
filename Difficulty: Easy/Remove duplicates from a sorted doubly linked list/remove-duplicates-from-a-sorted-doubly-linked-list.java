/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null){
            Node check = curr.next;
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
                if (curr.next!=null){
                    curr.next.prev = curr;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return head;
        
    }
}