/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root){
        ArrayList<ArrayList<Integer>> levels = new ArrayList<>();
        Queue<Node> todo = new LinkedList<>();
        todo.offer(root);
        while(!todo.isEmpty()){
            int size = todo.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr = todo.poll();
                level.add(curr.data);
                if(curr.left != null)  todo.offer(curr.left);
                if(curr.right != null) todo.offer(curr.right);
            }
            levels.add(level);
        }
        return levels;
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        ArrayList<ArrayList<Integer>> levels = levelOrderTraversal(root);
        for(ArrayList<Integer> level: levels){
            int size = level.size();
            ans.add(level.get(0));
        }
        return ans;
    }
}