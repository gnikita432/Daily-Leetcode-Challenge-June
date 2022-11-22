// 155. Min Stack

class MinStack {

    class minValPair{
        int val;
        int min;
        minValPair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    Stack<minValPair> st;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(new minValPair(val, val));
        }else{
            int min = st.peek().min>val? val : st.peek().min;
            st.push(new minValPair(val, min));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
// Time Complexity: O(1)
// Space Complexity: O(2N)

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 