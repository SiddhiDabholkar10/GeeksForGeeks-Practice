/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    int maxSum = Integer.MIN_VALUE;
    int depthSum(Node root){
        if(root == null) return 0;
        int leftSum = Math.max(0,depthSum(root.left));
        int rightSum = Math.max(0,depthSum(root.right));
        maxSum = Math.max(maxSum, root.data+leftSum+rightSum);
        return root.data + Math.max(leftSum, rightSum);
        
    }
    int findMaxSum(Node root) {
        // code here
        if(root==null) return 0;
        depthSum(root);
        return maxSum;
        
    }
}