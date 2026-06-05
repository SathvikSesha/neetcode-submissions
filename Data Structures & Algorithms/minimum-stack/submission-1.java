class MinStack {
    Stack<Integer> st;
    Stack<Integer> mt;
    public MinStack() {
        st = new Stack<>();
        mt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (mt.isEmpty())
            mt.push(val);
        else {
            if (val >= mt.peek())
                mt.push(mt.peek());
            else
                mt.push(val);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            int num = st.pop();
            if (!mt.isEmpty()) {
                mt.pop();
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mt.peek();
    }
}
