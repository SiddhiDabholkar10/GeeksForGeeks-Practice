'''Structure of Tree Node
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def preOrder(self, root):
    # code here
    
        result = []
        if root is None:
            return result
        st = [root]
        
        while st:
            curr = st.pop()
            result.append(curr.data)
            if curr.right:
                st.append(curr.right)
            if curr.left:
                st.append(curr.left)
        return result
            
    