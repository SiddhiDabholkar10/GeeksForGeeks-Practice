''' Structure of binary tree node
class Node:
    def __init__(self, val):
        self.data = val
        self.right = None
        self.left = None
'''

class Solution:
    def isSymHelper(self, root1, root2):
        if(root1 is None or root2 is None):
            return (root1 == root2)
        return ((root1.data == root2.data) and self.isSymHelper(root1.left,root2.right) and self.isSymHelper(root1.right,root2.left))
        
    def isSymmetric(self, root):
        # code here
        if(root is None):
            return true;
        return self.isSymHelper(root.left,root.right);
        