/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class NodeInfo{
        Node node;
        int vertical;
        NodeInfo(Node n, int v){
            node = n;
            vertical = v;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer,Integer> nodes = new TreeMap<>();
        Queue<NodeInfo> todo = new LinkedList<>();
        todo.offer(new NodeInfo(root,0));
        while(!todo.isEmpty()){
            NodeInfo n = todo.poll();
            Node temp = n.node;
            int x = n.vertical;
        
           nodes.putIfAbsent(x, temp.data);
           
           
           if(temp.left!=null) todo.offer(new NodeInfo(temp.left,x-1));
           if(temp.right!=null) todo.offer(new NodeInfo(temp.right,x+1));
        }
        
        for (Integer value : nodes.values()) {
            ans.add(value);
        }
        return ans;

    }
}