/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    static class NodeInfo{
        Node node;
        int vertical;
    
        NodeInfo(Node n, int v){
            node = n;
            vertical = v;
            
        }
        
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer,ArrayList<Integer>> nodes = new TreeMap<>();
        Queue<NodeInfo> todo = new LinkedList<>();
        
        todo.offer(new NodeInfo(root,0));
        
        while(!todo.isEmpty()){
            //get all info of the current entry in queue
            NodeInfo n = todo.poll();
            Node temp = n.node;
            int x = n.vertical;
            
            nodes.putIfAbsent(x, new ArrayList<>());
            nodes.get(x).add(temp.data);
            
            if(temp.left!=null) todo.offer(new NodeInfo(temp.left,x-1));
            if(temp.right!=null) todo.offer(new NodeInfo(temp.right,x+1));
            
        }
        
        for (ArrayList<Integer> col : nodes.values()) {
                    ans.add(col);
        }
        
        
        return ans;
    }
}