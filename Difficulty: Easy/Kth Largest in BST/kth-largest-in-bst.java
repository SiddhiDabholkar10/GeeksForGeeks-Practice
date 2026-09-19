/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    int count = 0;
    int klargest = -1;
    
    public int kthLargest(Node root, int k) {
        // code here
        reverseinorderTraversal(root,k);
        return klargest;
    }
    public void reverseinorderTraversal(Node root,int k){
        if(root == null || count >= k) return;
        reverseinorderTraversal(root.right, k);
        
        count ++;
        if(count == k) {
            klargest = root.data;
            return;
            
        }
        reverseinorderTraversal(root.left, k);
        
        
    }
}