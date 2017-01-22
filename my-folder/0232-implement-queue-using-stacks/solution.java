public class MyQueue {

    Stack<Integer> inbox = new Stack<Integer>();
    Stack<Integer> outbox = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        inbox.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        checkAndShift();
        return outbox.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        checkAndShift();
        return outbox.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
    
    private void checkAndShift() {
        if(outbox.isEmpty()) {
        while(!inbox.isEmpty()) {
            outbox.push(inbox.pop());
        }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
