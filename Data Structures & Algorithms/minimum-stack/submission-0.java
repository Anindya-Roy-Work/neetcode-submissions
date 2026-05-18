class MinStack {

    Stack<Integer> st, minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        int minVal = Integer.MAX_VALUE;
        if(!minSt.isEmpty()) minVal = minSt.peek();
        val = Math.min(val,minVal);
        minSt.push(val);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
