/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int count = 0;
    int ans = -1;
    public int kthSmallest(Node root, int k) {
        // code here
        inorderTraversal(root, k);
        return ans;
        
    }
    public void inorderTraversal(Node root, int k){
        if(root == null || count>=k) return;
        inorderTraversal(root.left,k);
        count++;
        if(count == k){
            ans = root.data;
            return;
        } 
        inorderTraversal(root.right,k);
    }
}