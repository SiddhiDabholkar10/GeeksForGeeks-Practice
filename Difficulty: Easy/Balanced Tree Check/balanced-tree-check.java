/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public int depth(Node root){
        if(root == null) return 0;
        int lh = depth(root.left);
        if(lh == -1) return -1;
        int rh = depth(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;
        return Math.max(lh,rh) + 1;
    }
    public boolean isBalanced(Node root) {
        // code here
        return depth(root) != -1;
        
        
    }
}