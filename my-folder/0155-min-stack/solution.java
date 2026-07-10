record Node(int val, int min) {}

class MinStack {

    Stack<Node> stack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        int min = Integer.MAX_VALUE;
        if(!stack.isEmpty()) {
            min = stack.peek().min();
        }

        min = Math.min(min, value);

        stack.push(new Node(value, min));
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek().val();
    }
    
    public int getMin() {
        return stack.peek().min();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
