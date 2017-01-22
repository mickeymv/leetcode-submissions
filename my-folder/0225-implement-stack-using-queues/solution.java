public class MyStack {

    Queue<Integer> p = new LinkedList<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(p.isEmpty()) {
            q.add(x);
        } else {
            p.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (p.isEmpty()) {
            while(q.size() != 1) {
                p.add(q.remove());
            }
            return q.remove();
        } else {
            while(p.size() != 1) {
                q.add(p.remove());
            }
            return p.remove();
        }
    }
    
    /** Get the top element. */
    public int top() {
       if (p.isEmpty()) {
            while(q.size() != 1) {
                p.add(q.remove());
            }
            int top = q.remove();
            p.add(top);
            return top;
        } else {
            while(p.size() != 1) {
                q.add(p.remove());
            }
            int top = p.remove();
            q.add(top);
            return top;
        } 
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return p.isEmpty() && q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
