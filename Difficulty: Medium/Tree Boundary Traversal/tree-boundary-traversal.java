/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    
    public boolean isLeaf(Node node){
        return (node.left==null && node.right==null);
    }
    
    public void addLeftBoundary(Node root, ArrayList<Integer> res){
        Node curr = root.left;
        while(curr!=null){
            //if it is not leaf 
            if(!isLeaf(curr)) res.add(curr.data);
            if(curr.left!=null) curr= curr.left;
            else curr= curr.right;
        }
        
    }
    
    public void addLeaves(Node root, ArrayList<Integer> res){
        
        if(isLeaf(root)){
            res.add(root.data);
            return;
        } 
        
        //The node was not a leaf so it has left or right
        // Recursively add leaves of the left and right subtrees
        if(root.left!=null) addLeaves(root.left,res);
        if(root.right!=null) addLeaves(root.right,res);
        
    }
    
    public void addRightBoundary(Node root, ArrayList<Integer> res){
        Node curr = root.right;
        
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr!=null){
        if(!isLeaf(curr)) temp.add(curr.data);
        if(curr.right!=null) curr= curr.right;
        else curr= curr.left;
        
        }
        
        //now reverse temp
        for(int i = temp.size() - 1; i >= 0; i--){
            res.add(temp.get(i));
        }
        
        
    }
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        
        //if root is not a leaf add it to res
        if(!isLeaf(root)) res.add(root.data);
        addLeftBoundary(root,res);
        addLeaves(root,res);
        addRightBoundary(root,res);
        return res;
        
    }
}