/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int dfs(Node root){
        
        if(root==null) return -1;
        int left_c = dfs(root.left);
        int right_c = dfs(root.right);
        return 1 + Math.max(left_c, right_c);
        
    }
    public int height(Node root) {
        // code here
        if(root == null) return 0;
        return dfs(root);
        
    }
}