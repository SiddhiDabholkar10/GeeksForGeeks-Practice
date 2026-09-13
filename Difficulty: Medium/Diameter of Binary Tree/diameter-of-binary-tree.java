/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int diameter;
    public int depth(Node root){
        if(root == null) return 0;
        int lh = depth(root.left);
        int rh = depth(root.right);
        diameter = Math.max(diameter, lh+rh);
        return 1 + Math.max(lh,rh);
    }
    public int diameter(Node root) {
        // code here
        if(root == null) return 0;
        depth(root);
        return diameter;
    }
}