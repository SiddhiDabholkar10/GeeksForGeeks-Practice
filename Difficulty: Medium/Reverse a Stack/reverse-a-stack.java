class Solution {
    
    public static void insertAtBottom(Stack<Integer> st, int firstPopped){
        if(st.isEmpty()){
            st.push(firstPopped);
            return;
        }
         // Pop the top element
        int topVal = st.pop();
        insertAtBottom(st,firstPopped);
        st.push(topVal);

    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
         if (st.isEmpty()) return;
         int firstPopped = st.pop();
         reverseStack(st);
         insertAtBottom(st,firstPopped);
    }
}
