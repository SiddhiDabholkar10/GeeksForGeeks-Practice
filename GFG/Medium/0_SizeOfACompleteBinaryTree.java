/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-number-of-nodes-in-a-binary-tree/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    
    public int countLeftHeight(Node node){
        int lh = 0;
        while(node!=null){
            lh++;
            node = node.left;
        }
        return lh;
    }
    public int countRightHeight(Node node){
        int rh = 0;
        while(node!=null){
            rh++;
            node = node.right;
        }
        return rh;
    }

    public int countNodes(Node root) {
        // code here
        if(root == null) return 0;
        int lh = countLeftHeight(root);
        int rh = countRightHeight(root);
        if(lh==rh) return (int) Math.pow(2,lh) - 1;
        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}
