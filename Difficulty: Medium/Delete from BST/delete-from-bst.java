/* Structure of a Binary Search Tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}; */

class Solution {
    public Node delNode(Node root, int x) {
        // code here
        if(root == null) return root;
        if(x<root.data) root.left = delNode(root.left, x);
        else if(x>root.data) root.right = delNode(root.right,x);
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            Node smallest = root.right;
            while(smallest.left!=null) smallest = smallest.left;
            root.data = smallest.data;
            root.right = delNode(root.right, smallest.data);
        }
        return root;
    }
}