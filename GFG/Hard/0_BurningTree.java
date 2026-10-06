/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/burning-tree/1
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
    public Node trackParents_getTarget(Node root, Map<Node,Node> parent_track, int target){
        Queue<Node> queue = new LinkedList<>();
        Node targetNode = null;
        queue.offer(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.data == target) targetNode = curr;
            if(curr.left!=null){
                parent_track.put(curr.left,curr);
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                parent_track.put(curr.right,curr);
                queue.offer(curr.right);
            }
        }
        return targetNode;
    }
    public int minTime(Node root, int target) {
        // code here
        if(root == null) return 0;
        Map<Node,Node> parent_track = new HashMap<>();
        Node targetNode = trackParents_getTarget(root,parent_track,target);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(targetNode);
        Set<Node> visited = new HashSet<>();
        visited.add(targetNode);
        int time = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean burn = false;
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    burn = true;
                    visited.add(curr.left);
                    queue.offer(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    burn = true;
                    visited.add(curr.right);
                    queue.offer(curr.right);
                }
                if(parent_track.get(curr)!=null && !visited.contains(parent_track.get(curr))){
                    burn = true;
                    visited.add(parent_track.get(curr));
                    queue.offer(parent_track.get(curr));
                }
            }
            if(burn == true) time++;
        }
        return time;
        
        
    }
}
