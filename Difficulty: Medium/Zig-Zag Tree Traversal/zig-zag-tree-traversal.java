/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean isLeftToRight  = true;
        while(!q.isEmpty()){
            
            int size = q.size();
            Integer[] level = new Integer[size];
            for(int i=0;i<size;i++){
                Node n = q.poll();
                
                int index = isLeftToRight ? i : size - i - 1;
                level[index] = n.data;
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);

            }
            result.addAll(Arrays.asList(level));
            isLeftToRight = !isLeftToRight;
            
            
        }
        return result;
        
    }
}