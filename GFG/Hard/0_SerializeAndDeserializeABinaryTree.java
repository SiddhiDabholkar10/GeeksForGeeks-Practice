/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
 * Platform     : GFG
 * Difficulty   : Hard
 */

/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
    
        Queue<Node> todo = new LinkedList<>();
        todo.add(root);
        while(!todo.isEmpty()){
            Node node = todo.poll();
            if(node == null){
                res.add(null);
                continue;
            }
            
            res.add(node.data);
            todo.add(node.left);
            todo.add(node.right);
            
        }
        return res;
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        
        // code here
        if(arr.isEmpty()) return null;
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(arr.get(0));
        queue.add(root);
        
        for (int i = 1; i < arr.size(); i++) {
            Node parent = queue.poll();
            if(arr.get(i)!=null){ //we have left
                Node left = new Node(arr.get(i));
                parent.left = left;
                queue.add(left);
                
            }
            if(arr.get(++i)!=null){ //we have right
                Node right = new Node(arr.get(i));
                parent.right  = right ;
                queue.add(right);
                
            }
        }
        return root;
    }
};
