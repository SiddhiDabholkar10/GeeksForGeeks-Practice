/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/* Structure of binary tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public Node buildTree(int[] inorder, int[] postorder) {
        // code here
        Map<Integer,Integer> inorder_indexmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorder_indexmap.put(inorder[i],i);
        }
        Node root = buildTree(inorder,0,inorder.length-1,postorder, postorder.length-1,0,inorder_indexmap);
        return root;
        
    }
    public Node buildTree(int[] inorder,int inStart, int inEnd, int[] postorder,int postStart, int postEnd, Map<Integer,Integer> inorder_indexmap){
        if(inStart>inEnd || postStart<postEnd) return null;
        Node root = new Node(postorder[postStart]);
        int inRoot_index = inorder_indexmap.get(root.data);  //4
        int nodesOnLeft = inRoot_index-inStart; //4  //right  6 7 3     //left 2 5 4 8
        root.left = buildTree(inorder,inStart,inRoot_index-1,postorder,postEnd+nodesOnLeft-1,postEnd,inorder_indexmap);
        root.right = buildTree(inorder,inRoot_index+1,inEnd,postorder,postStart-1,postEnd+nodesOnLeft,inorder_indexmap);
        return root;
    }
}
