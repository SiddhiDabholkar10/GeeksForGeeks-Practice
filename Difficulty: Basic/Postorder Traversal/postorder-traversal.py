''' Structure of Binary Tree Node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def postorderHelper(self,root,arr):
        if root is None:
            return
        
        self.postorderHelper(root.left,arr)
        self.postorderHelper(root.right,arr)
        arr.append(root.data)
    def postOrder(self, root):
        # code here
        arr = []
        self.postorderHelper(root,arr)
        return arr
        
        