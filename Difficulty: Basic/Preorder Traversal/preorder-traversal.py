'''Structure of Tree Node
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def preOrderHelper(self,root,arr):
        if root is None:
            return
        arr.append(root.data)
        self.preOrderHelper(root.left,arr)
        self.preOrderHelper(root.right,arr)
        
    def preOrder(self, root):
    # code here
        arr = []
        self.preOrderHelper(root,arr)
        return arr