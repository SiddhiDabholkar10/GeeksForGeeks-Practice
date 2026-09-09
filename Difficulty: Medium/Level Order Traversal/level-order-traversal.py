''' Structure of Binary Tree Node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''
from collections import deque

class Solution:
    def levelOrder(self, root):
        # code here
        ansList = []
        if not root: return ansList
        
        q = deque([root])
        while q:
            level = []
            for _ in range(len(q)):
                n = q.popleft()
                ansList.append(n.data)
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)
            
            
        return ansList
        