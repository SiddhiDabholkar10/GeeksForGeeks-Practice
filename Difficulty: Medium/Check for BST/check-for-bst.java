/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public boolean isBST(Node root, long minVal, long maxVal) {
        // code here
        if(root == null) return true;
        if(root.data<=minVal || root.data>=maxVal) return false;
        return (isBST(root.left,minVal,root.data) && isBST(root.right,root.data,maxVal));
        
    }
    public boolean isBST(Node root) {
        // code here
        return isBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
}