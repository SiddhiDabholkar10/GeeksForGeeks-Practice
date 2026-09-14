/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

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
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<NodeInfo> todo = new LinkedList<>();
        todo.offer(new NodeInfo(root,0));
        while(!todo.isEmpty()){
            NodeInfo n = todo.poll();
            Node temp = n.node;
            int line = n.vertical;
            map.put(line,temp.data);
            if(temp.left!=null) todo.offer(new NodeInfo(temp.left, line-1));
            if(temp.right!=null) todo.offer(new NodeInfo(temp.right, line+1));
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}