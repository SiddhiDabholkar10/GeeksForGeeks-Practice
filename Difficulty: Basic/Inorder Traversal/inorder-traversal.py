''' Structure of Binary Tree Node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def inOrder(self, root):
        # code here
        st = []
        result = []
        node = root
        while True:
            if node is not None:
                #Push current node to stack
                st.append(node)
                node = node.left
            else:
                # If the stack is empty,
                # break the loop
                if not st:
                    break
                node = st.pop()
                result.append(node.data)
                node = node.right
                
        return result