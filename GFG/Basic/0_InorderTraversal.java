/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/inorder-traversal/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> inorder = new ArrayList<>();
        Node curr = root;
        while(curr!=null){
            if(curr.left==null){   //left is null
                inorder.add(curr.data);
                curr = curr.right;
            }
            else{  //left exist; go to the last guy 
                Node last = curr.left;
                while(last.right!=null && last.right!=curr){
                    last = last.right;
                }
                if(last.right == null){
                    last.right = curr;
                    curr = curr.left;
                }
                //already thread exist
                else if(last.right == curr){
                    inorder.add(curr.data);
                    last.right = null;
                    curr = curr.right;
                }
            }
        }
        return  inorder;
    }
}
